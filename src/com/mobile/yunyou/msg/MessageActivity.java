package com.mobile.yunyou.msg;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.mobile.lbs.R;
import com.mobile.yunyou.YunyouApplication;
import com.mobile.yunyou.activity.BaseActivity;
import com.mobile.yunyou.model.DeviceSetType;
import com.mobile.yunyou.model.DeviceSetType.DeviceMsgData;
import com.mobile.yunyou.model.ResponseDataPacket;
import com.mobile.yunyou.network.IRequestCallback;
import com.mobile.yunyou.network.NetworkCenterEx;
import com.mobile.yunyou.util.CommonLog;
import com.mobile.yunyou.util.LogFactory;
import com.mobile.yunyou.util.Utils;
import com.mobile.yunyou.widget.RefreshListView;
//import com.mobile.yunyou.datastore.MsgDBManager;

public class MessageActivity extends BaseActivity implements OnClickListener, 
											RefreshListView.IOnRefreshListener,
											RefreshListView.IOnLoadMoreListener,
											IRequestCallback,
											MsgRuestProxy.IRequestComplete{

	private final static int QUERY_COUNT = 5;
	private final static int REQUEST_CODE = 0x0001;
	
	
	private static final CommonLog log = LogFactory.createLog();

	private YunyouApplication mApplication;
	private NetworkCenterEx mNetworkCenter;
	private MsgManager mMsgManager;
	
	private ProgressBar mLoadProgressBar;
	private Button mBtnRefresh;
	
	private Button mBtnSend;
	private Button mBtnBack;
	private Button mBtnGoMsgDeletActivity;
	private EditText mEditTextContent;
	private RefreshListView mListView;
	private ChatMsgViewAdapter mAdapter; 
	private LinkedList<ChatMsgEntity> mDataArrays = new LinkedList<ChatMsgEntity>();
	
	
	private MsgRuestProxy msgRuestProxy;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_layout);
        
        
        initView();
        
        initData();
      
    }
	
	
	
	
	 @Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();

	 }




	public void initView()
    {
		mLoadProgressBar = (ProgressBar) findViewById(R.id.load_progress);
		mBtnRefresh = (Button) findViewById(R.id.btn_load);
		mBtnRefresh.setOnClickListener(this);
    	mListView = (RefreshListView) findViewById(R.id.listview);
    
    	mBtnSend = (Button) findViewById(R.id.btn_send);
    	mBtnSend.setOnClickListener(this);
    	mBtnGoMsgDeletActivity = (Button) findViewById(R.id.btn_go);
    	mBtnGoMsgDeletActivity.setOnClickListener(this);
    	
    	mEditTextContent = (EditText) findViewById(R.id.et_sendmessage);
    }
	     
    
    public void initData()
    {
    	mApplication = YunyouApplication.getInstance();
    	mNetworkCenter = NetworkCenterEx.getInstance();
    	mMsgManager = MsgManager.getInstance();
    	msgRuestProxy = msgRuestProxy.getInstance(mNetworkCenter);
    	msgRuestProxy.setIRequestComplete(this);
    //	mMsgManager.resetMsgFromDatabase();	
   // 	List<DeviceSetType.DeviceMsgData> list = mMsgManager.queryHistory(QUERY_COUNT);
    	
    	
//    	for(int i = 0; i < list.size(); i++)
//    	{
//    		ChatMsgEntity entity = new ChatMsgEntity(list.get(i));
//    	
//    		mDataArrays.addLast(entity);
//    	}

    	mAdapter = new ChatMsgViewAdapter(this, mDataArrays);
		mListView.setAdapter(mAdapter);
		mListView.setOnRefreshListener(this);
		mListView.setOnLoadMoreListener(this);
		mListView.setOnItemClickListener(mAdapter);
		
		if (isExitLocalMsg() == false)
		{
		//	mListView.removeFootView();
			mListView.setVisibility(View.GONE);
			mBtnRefresh.setVisibility(View.VISIBLE);
		}
		
//		mListView.removeHeadView();
	
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		case R.id.btn_send:
		//	send();
			break;
		case R.id.btn_go:
//			mMsgManager.clearMsg();
//			mDataArrays.clear();
//			mListView.removeFootView();
//			mBtnRefresh.setVisibility(View.VISIBLE);
//			mListView.setVisibility(View.GONE);
//			mAdapter.notifyDataSetChanged();
			if (isExitLocalMsg() == true)
			{
				goMsgDelActivity();
			}else{
				Utils.showToast(this, R.string.toask_tip_no_msg_del);
			}
			
			break;
		case R.id.btn_load:
			refresh();
			break;
		}
	}
	
	private boolean isExitLocalMsg()
	{
		return mDataArrays.size() == 0 ? false : true;
	}
	
	
//	private void send()
//	{
//		String contString = mEditTextContent.getText().toString();
//		if (contString.length() > 0)
//		{
//			ChatMsgEntity entity = new ChatMsgEntity();
//			entity.setDate(getDate());
//			entity.setName("妹妹");
//			entity.setMsgType(false);
//			entity.setText(contString);
//			
//			mDataArrays.add(entity);
//			mAdapter.notifyDataSetChanged();
//			
//			mEditTextContent.setText("");
//			
//			mListView.setSelection(mListView.getCount() - 1);
//		}
//	}

	private void refresh()
	{
		mBtnRefresh.setVisibility(View.GONE);
		mLoadProgressBar.setVisibility(View.VISIBLE);
		
		int unReadCount = mApplication.getUnreadCount();
		
		msgRuestProxy.requestLast(unReadCount);
//		DeviceSetType.DeviceRequestMsg object = new DeviceSetType.DeviceRequestMsg();
//		object.mOffset = 0;
//		object.mNum = QUERY_COUNT;
//		mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_MSG_MASID, object, this);
	}
	
	private void goMsgDelActivity()
	{
				
		Intent intent = new Intent();
		intent.setClass(this, MsgDeleteActivity.class);		
		startActivityForResult(intent, REQUEST_CODE);
	}

	@Override
	public void OnLoadMore() {
		// TODO Auto-generated method stub
		
//		List<DeviceSetType.DeviceMsgData> list = mMsgManager.queryHistory(QUERY_COUNT);
//    	int size = list.size();
//    	if (size == 0)
//    	{
//    		mListView.onLoadMoreComplete(true);
//    		return ;
//    	}
//    	
//    	for(int i = 0; i < list.size(); i++)
//    	{
//    		ChatMsgEntity entity = new ChatMsgEntity(list.get(i));
//    	
//    		mDataArrays.addLast(entity);
//    	}	
//    	
//    	mAdapter.notifyDataSetChanged();
//    	mListView.onLoadMoreComplete(false);
		
		msgRuestProxy.requestHistory();
	}

	@Override
	public void OnRefresh() {
		// TODO Auto-generated method stub
		
		int unReadCount = mApplication.getUnreadCount();
		
//		DeviceSetType.DeviceRequestMsg object = new DeviceSetType.DeviceRequestMsg();
//		object.mOffset = 0;
//		object.mNum = unReadCount == 0 ? QUERY_COUNT : unReadCount;
//		object.mSinceID = Integer.MAX_VALUE;
//		mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_MSG_MASID, object, this);
		
		msgRuestProxy.requestLast(unReadCount);
		
	}
	


	@Override
	public boolean onComplete(int requestAction, ResponseDataPacket dataPacket) {
		// TODO Auto-generated method stub
		
		String jsString = "null";
		if (dataPacket != null)
		{
			jsString = dataPacket.toString();
		}
		
		log.e("requestAction = " + Utils.toHexString(requestAction) + "\nResponseDataPacket = \n" +jsString);
		
		switch(requestAction)
		{
			case DeviceSetType.DEVICE_GET_MSG_MASID:
			//	onGetMsgResult(dataPacket);
				break;
			default:
				break;
		}
		
		return true;
	}
	
//	private void onGetMsgResult(ResponseDataPacket dataPacket)
//	{
//		
//		if (dataPacket.rsp == 0)
//		{
//			String msg = dataPacket.msg;
//			if (msg.length() > 0)
//			{
//				Utils.showToast(this, msg);
//			}else{
//				Utils.showToast(this, R.string.request_data_fail);
//			}
//			
//			if (isExitLocalMsg() == false)
//			{
//				mBtnRefresh.setVisibility(View.VISIBLE);
//				mLoadProgressBar.setVisibility(View.GONE);
//			}else{
//				mListView.onRefreshComplete();
//			}			
//			
//			return ;
//		}
//		
//		boolean flag = false;
//		DeviceSetType.DeviceMsgDataGroup group = new DeviceSetType.DeviceMsgDataGroup();
//			
//		try {
//			group.parseString(dataPacket.data.toString());
//			flag = true;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		List<DeviceMsgData> dataList = group.mDeviceMsglist;
//		int size = dataList.size();
//		
//		if (flag == false || size == 0)
//		{
//			if (isExitLocalMsg() == false)
//			{
//				mBtnRefresh.setVisibility(View.VISIBLE);
//				mLoadProgressBar.setVisibility(View.GONE);
//			}else{
//				mListView.onRefreshComplete();
//			}
//			
//			if (size == 0)
//			{
//				mApplication.setUnreadCount(0);
//			}
//		
//			
//			
//			return ;
//		}
//	
//		for(int i = 0; i < size; i++)
//		{
//			ChatMsgEntity entity = new ChatMsgEntity(dataList.get(i));
//			mDataArrays.addFirst(entity);	
//		}
//		
//		mAdapter.notifyDataSetChanged();
//		
//		mBtnRefresh.setVisibility(View.GONE);
//		mLoadProgressBar.setVisibility(View.GONE);
//		mListView.setVisibility(View.VISIBLE);
//		mListView.onRefreshComplete();
//	
//	//	mMsgManager.insertMsg(dataList);
//		
//		mApplication.setUnreadCount(0);
//	}
	
	
	


	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub

		switch(requestCode)
		{
			case REQUEST_CODE:
			{
				if (resultCode == RESULT_OK)
				{
					refreshListData();
				}
			}
			break;
		}
	}
	
	
	private void refreshListData()
	{
		
    //	mMsgManager.resetMsgFromDatabase();	
    //	List<DeviceSetType.DeviceMsgData> list = mMsgManager.queryHistory(QUERY_COUNT);
		List<DeviceSetType.DeviceMsgData> list = msgRuestProxy.getDataArray();
    	mDataArrays.clear();
    	
    	log.e("list.size = " + list.size());
    	
    	for(int i = 0; i < list.size(); i++)
    	{
    		ChatMsgEntity entity = new ChatMsgEntity(list.get(i));
    	
    		mDataArrays.addLast(entity);
    	}

    	mAdapter.setData(mDataArrays);
		if (isExitLocalMsg() == false)
		{
			mListView.removeFootView();
			mListView.setVisibility(View.GONE);
			mBtnRefresh.setVisibility(View.VISIBLE);
		}

	}




	@Override
	public void onGetResult(boolean success) {
		
		if (!success)
		{
			Utils.showToast(this, R.string.request_data_fail);
			if (isExitLocalMsg() == false)
			{
				mBtnRefresh.setVisibility(View.VISIBLE);
				mLoadProgressBar.setVisibility(View.GONE);
			}else{
				mListView.onRefreshComplete();
				mListView.onLoadMoreComplete(false);
			}			
			
			return ;
		}
		
		
		List<DeviceMsgData> dataList = msgRuestProxy.getDataArray();
		int size = dataList.size();
		
		if (size == 0)
		{
			if (isExitLocalMsg() == false)
			{
				mBtnRefresh.setVisibility(View.VISIBLE);
				mLoadProgressBar.setVisibility(View.GONE);
			}else{
				mListView.onRefreshComplete();
				mListView.onLoadMoreComplete(false);
			}
			
			mApplication.setUnreadCount(0);		
			return ;
		}
	
		mDataArrays.clear();
		for(int i = 0; i < size; i++)
		{
			ChatMsgEntity entity = new ChatMsgEntity(dataList.get(i));
			log.e("i = " + i + ", mid = " +  dataList.get(i).mID);
			mDataArrays.addLast(entity);	
		}
		
		mAdapter.notifyDataSetChanged();
		
		mBtnRefresh.setVisibility(View.GONE);
		mLoadProgressBar.setVisibility(View.GONE);
		mListView.setVisibility(View.VISIBLE);
		mListView.onRefreshComplete();
		mListView.onLoadMoreComplete(false);
	
	//	mMsgManager.insertMsg(dataList);
		
		mApplication.setUnreadCount(0);
		
	}
	
	
}
