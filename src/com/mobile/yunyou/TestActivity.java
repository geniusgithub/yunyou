package com.mobile.yunyou;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.mobile.lbs.R;
import com.mobile.yunyou.model.DeviceSetType;
import com.mobile.yunyou.model.GloalType;
import com.mobile.yunyou.model.ProductType;
import com.mobile.yunyou.model.ProductType.GetPackage;
import com.mobile.yunyou.model.PublicType;
import com.mobile.yunyou.model.ResponseDataPacket;
import com.mobile.yunyou.network.IRequestCallback;
import com.mobile.yunyou.network.NetworkCenterEx;
import com.mobile.yunyou.network.api.AbstractTaskCallback;
import com.mobile.yunyou.util.CommonLog;
import com.mobile.yunyou.util.LogFactory;
import com.mobile.yunyou.util.Utils;



public class TestActivity extends Activity implements OnClickListener, IRequestCallback{

	 private static final CommonLog log = LogFactory.createLog();
	
	 private Button btn1;
	 private Button btn2;		
	 private Button btn3;
	 private Button btn4;	
	 private Button btn5;
	 private Button btn6;
	 private Button btn7;
	 private Button btn8;
	 
	 private Button btn9;
	 private Button btn10;
	 private Button btn11;
	 private Button btn12;
	 private Button btn13;
	 private Button btn14;
	 private Button btn15;
	 private Button btn16;
	 private Button btn17;
	 private Button btn18;
	 private Button btn19;
	 private Button btn20;
	 private Button btn21;
	 private Button btn22;
	 private Button btn23;
	 private Button btn24;
	 private Button btn25;
	 private Button btn26;
	 private Button btn27;
	 private Button btn28;
	 private Button btn29;
	 private Button btn30;
	 private Button btn31;
	 private Button btn32;
	 private Button btn33;
	 private Button btn34;
	 private Button btn35;
	 private Button btn36;
	 
	 
		private YunyouApplication mApplication;
		private NetworkCenterEx mNetworkCenter;

		
	  public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.test_layout);
	       
	        initView();
	        
	        mApplication = (YunyouApplication) getApplication();
	    	mNetworkCenter = mApplication.getNetworkCenter();


	    	
	    	mNetworkCenter.initNetwork();
	    }
	    
	    
	    public void initView()
	    {
	    	btn1 = (Button) findViewById(R.id.button1);
	    	btn1.setOnClickListener(this);
	    	
	    	btn2 = (Button) findViewById(R.id.button2);
	    	btn2.setOnClickListener(this);
	    	
	    	btn3 = (Button) findViewById(R.id.button3);
	    	btn3.setOnClickListener(this);
	    	
	    	btn4 = (Button) findViewById(R.id.button4);
	    	btn4.setOnClickListener(this);
	    	
	    	btn5 = (Button) findViewById(R.id.button5);
	    	btn5.setOnClickListener(this);
	    	
	    	btn6 = (Button) findViewById(R.id.button6);
	    	btn6.setOnClickListener(this);
	    	
	    	btn7 = (Button) findViewById(R.id.button7);
	    	btn7.setOnClickListener(this);
	    	
	    	btn8 = (Button) findViewById(R.id.button8);
	    	btn8.setOnClickListener(this);
	    	
	    	btn9 = (Button) findViewById(R.id.button9);
	    	btn9.setOnClickListener(this);
	    	
	    	btn10 = (Button) findViewById(R.id.button10);
	    	btn10.setOnClickListener(this);
	    	
	    	btn11 = (Button) findViewById(R.id.button11);
	    	btn11.setOnClickListener(this);
	    	
	    	btn12 = (Button) findViewById(R.id.button12);
	    	btn12.setOnClickListener(this);
	    	
	    	btn13 = (Button) findViewById(R.id.button13);
	    	btn13.setOnClickListener(this);
	    	
	    	btn14 = (Button) findViewById(R.id.button14);
	    	btn14.setOnClickListener(this);
	    	
	    	btn15 = (Button) findViewById(R.id.button15);
	    	btn15.setOnClickListener(this);
	    	
	    	btn16 = (Button) findViewById(R.id.button16);
	    	btn16.setOnClickListener(this);
	    	
	    	
	    	
	    	btn17 = (Button) findViewById(R.id.button17);
	    	btn17.setOnClickListener(this);
	    	
	    	btn18 = (Button) findViewById(R.id.button18);
	    	btn18.setOnClickListener(this);
	    	
	    	btn19 = (Button) findViewById(R.id.button20);
	    	btn19.setOnClickListener(this);
	    	
	    	btn20 = (Button) findViewById(R.id.button20);
	    	btn20.setOnClickListener(this);
	    	
	    	btn21 = (Button) findViewById(R.id.button21);
	    	btn21.setOnClickListener(this);
	    	
	    	btn22 = (Button) findViewById(R.id.button22);
	    	btn22.setOnClickListener(this);
	    	
	    	btn23 = (Button) findViewById(R.id.button23);
	    	btn23.setOnClickListener(this);
	     	
	    	btn24 = (Button) findViewById(R.id.button24);
	    	btn24.setOnClickListener(this);
	    	
	    	btn25 = (Button) findViewById(R.id.button25);
	    	btn25.setOnClickListener(this);
	    	
	    	btn26 = (Button) findViewById(R.id.button26);
	    	btn26.setOnClickListener(this);
	    	
	    	btn27 = (Button) findViewById(R.id.button27);
	    	btn27.setOnClickListener(this);
	    	
	    	btn28 = (Button) findViewById(R.id.button28);
	    	btn28.setOnClickListener(this);
	    	
	    	btn29 = (Button) findViewById(R.id.button29);
	    	btn29.setOnClickListener(this);
	    	
	       	btn30 = (Button) findViewById(R.id.button30);
	    	btn30.setOnClickListener(this);
	    	
	    	btn31 = (Button) findViewById(R.id.button31);
	    	btn31.setOnClickListener(this);
	    	
	    	btn32 = (Button) findViewById(R.id.button32);
	    	btn32.setOnClickListener(this);
	    	
	     	btn33 = (Button) findViewById(R.id.button33);
	    	btn33.setOnClickListener(this);
	    	
	    	btn34 = (Button) findViewById(R.id.button34);
	    	btn34.setOnClickListener(this);
	    	
	    	btn35 = (Button) findViewById(R.id.button35);
	    	btn35.setOnClickListener(this);
	    	
	    	btn36 = (Button) findViewById(R.id.button36);
	    	btn36.setOnClickListener(this);
	    }


		@Override
		public void onClick(View view) {
			// TODO Auto-generated method stub
			switch(view.getId())
			{
				case R.id.button1:
					doBtn1();
					break;
				case R.id.button2:
					doBtn2();
					break;
				case R.id.button3:
					doBtn3();
					break;
				case R.id.button4:
					doBtn4();
					break;
				case R.id.button5:
					doBtn5();
					break;
				case R.id.button6:
					doBtn6();
					break;
				case R.id.button7:
					doBtn7();
					break;
				case R.id.button8:
					doBtn8();
					break;
				case R.id.button9:
					doBtn9();
					break;
				case R.id.button10:
					doBtn10();
					break;
				case R.id.button11:
					doBtn11();
					break;
				case R.id.button12:
					doBtn12();
					break;
				case R.id.button13:
					doBtn13();
					break;
				case R.id.button14:
					doBtn14();
					break;
				case R.id.button15:
					doBtn15();
					break;
				case R.id.button16:
					doBtn16();
					break;
				case R.id.button17:
					doBtn17();
					break;
				case R.id.button18:
					doBtn18();;
					break;
				case R.id.button19:
					doBtn19();
					break;
				case R.id.button20:
					doBtn20();;
					break;
				case R.id.button21:
					doBtn21();;
					break;
				case R.id.button22:
					doBtn22();
					break;
				case R.id.button23:
					doBtn23();
					break;
				case R.id.button24:
					doBtn24();
					break;
				case R.id.button25:
					doBtn25();
					break;
				case R.id.button26:
					doBtn26();
					break;
				case R.id.button27:
					doBtn27();
					break;
				case R.id.button28:
					doBtn28();
					break;
				case R.id.button29:
					doBtn29();
					break;
				case R.id.button30:
					doBtn30();
					break;
				case R.id.button31:
					doBtn31();
					break;
				case R.id.button32:
					doBtn32();
					break;
				case R.id.button33:
					doBtn33();
					break;
				case R.id.button34:
					doBtn34();
					break;
				case R.id.button35:
					doBtn35();
					break;
				case R.id.button36:
					doBtn36();
					break;
			}
		}

		// 按键设置
		public void doBtn1()
		{
			DeviceSetType.KeySet keySet1 = new DeviceSetType.KeySet();
			keySet1.mKey = "1";
			keySet1.mPhoneNumber = "13010555666";
			keySet1.mName = "bo";
			
			DeviceSetType.KeySet keySet2 = new DeviceSetType.KeySet();
			keySet2.mKey = "2";
			keySet2.mPhoneNumber = "13010666777";
			keySet2.mName = "ki";
				
			List<DeviceSetType.KeySet> list = new ArrayList<DeviceSetType.KeySet>();
			list.add(keySet1);
			list.add(keySet2);
			
			
			DeviceSetType.KeySetGroup keySetGroup = new DeviceSetType.KeySetGroup();
			keySetGroup.mKeySetList = list;
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_KEYSET_MASID, keySetGroup, this);
			
		}
		public void doBtn2()
		{
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_KEYSET_MASID, null, this);
		}
		
		// 通话时长设置
		public void doBtn3()
		{
			DeviceSetType.CallTime callTime = new DeviceSetType.CallTime();
			callTime.mTime = 3;
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_CALL_TIME_MASID, callTime, this);
		}
		
		public void doBtn4()
		{
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_CALL_TIME_MASID, null, this);
		}
		
		
		// 白名单设置
		public void doBtn5()
		{
			DeviceSetType.WhiteListSet whiteListSet1 = new DeviceSetType.WhiteListSet();
			whiteListSet1.mName = "kira";
			whiteListSet1.mPhoneNumber  = "13510123456";
			
			DeviceSetType.WhiteListSet whiteListSet2 = new DeviceSetType.WhiteListSet();
			whiteListSet2.mName = "kira";
			whiteListSet2.mPhoneNumber  = "13510789456";
			
			List<DeviceSetType.WhiteListSet> list = new ArrayList<DeviceSetType.WhiteListSet>();
			list.add(whiteListSet1);
			list.add(whiteListSet2);
			
			DeviceSetType.WhiteListSetGroup whiteListSetGroup = new DeviceSetType.WhiteListSetGroup();
			whiteListSetGroup.mWhiteListSetList = list;
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_WHITELIST_SET_MASID, whiteListSetGroup, this);
			
		}
		
		public void doBtn6()
		{
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_WHITELIST_MASID, null, this);
		}
		
		
		// 闹钟设置
		public void doBtn7()
		{
			
			DeviceSetType.ClockSet clockSet1 = new DeviceSetType.ClockSet();
			clockSet1.mTimeString = "1330";
			clockSet1.mCycle = 0;
			clockSet1.mWeekString = "1,3,4";
			clockSet1.mSwitch = 1;
				
			DeviceSetType.ClockSet clockSet2 = new DeviceSetType.ClockSet();
			clockSet2.mTimeString = "1530";
			clockSet2.mCycle = 0;
			clockSet2.mWeekString = "1,5";
			clockSet2.mSwitch = 0;
			
			List<DeviceSetType.ClockSet> clockSetList = new ArrayList<DeviceSetType.ClockSet>();
			clockSetList.add(clockSet1);
			clockSetList.add(clockSet2);
			
			DeviceSetType.ClockSetGroup clockSetGroup = new DeviceSetType.ClockSetGroup();
			clockSetGroup.mClockSetList = clockSetList;
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_CLOCK_SET_MASID, clockSetGroup, this);
		}
		
		public void doBtn8()
		{
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_CLOCK_MASID, null, this);
		}
	
		// 情景模式
		public void doBtn9()
		{
			DeviceSetType.SceneMode sceneMode = new DeviceSetType.SceneMode();
			sceneMode.mModeString = "shake";
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_SCENEMODE_SET_MASID, sceneMode, this);
		}
		public void doBtn10()
		{
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_SCENEMODE_MASID, null, this);
		}
		
		// 电源设置
		public void doBtn11()
		{
			DeviceSetType.PowerSet powerSet = new DeviceSetType.PowerSet();
			powerSet.mSceenString = "sleep";
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_POWER_SET_MASID, powerSet, this);
		}	
		public void doBtn12()
		{
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_POWER_MASID, null, this);
		}
		
		
		
		// 低电量提醒
		public void doBtn13()
		{
			DeviceSetType.LowPowerWarn lowPowerWarn = new DeviceSetType.LowPowerWarn();
			lowPowerWarn.mPowerLevel = 1;
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_LOWPOWER_WARN_SET_MASID, lowPowerWarn, this);
		}
		public void doBtn14()
		{
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_LOWPOWER_WARN_MASID, null, this);	
		}
		
		
		
		// GPS间隔
		public void doBtn15()
		{
			DeviceSetType.GpsInterval gpsInterval = new DeviceSetType.GpsInterval();
			gpsInterval.mGPSInterval = 10;
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GPS_INTERVAL_SET_MASID, gpsInterval, this);
		}
		public void doBtn16()
		{
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_GPS_INTERVAL_MASID, null, this);
		}
		
		// GPS上报时间
		public void doBtn17()
		{
			DeviceSetType.GpsStillTime gpsStillTime1 = new DeviceSetType.GpsStillTime();
			gpsStillTime1.mWeekString = "1,2,3";
			gpsStillTime1.mStartTimeString = "0830";
			gpsStillTime1.mEndTimeString = "1200";
			
			DeviceSetType.GpsStillTime gpsStillTime2 = new DeviceSetType.GpsStillTime();
			gpsStillTime2.mWeekString = "4";
			gpsStillTime2.mStartTimeString = "1430";
			gpsStillTime2.mEndTimeString = "1600";
			
			List<DeviceSetType.GpsStillTime> list = new ArrayList<DeviceSetType.GpsStillTime>();
			list.add(gpsStillTime1);
			list.add(gpsStillTime2);
			
			DeviceSetType.GpsStillTimeGroup gpsStillTimeGroup = new DeviceSetType.GpsStillTimeGroup();
			gpsStillTimeGroup.mGpsStillTimeList = list;
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GPS_STILLTIME_SET_MASID, gpsStillTimeGroup, this);
		}
		
		public void doBtn18()
		{
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_GPS_STILLTIME_MASID, null, this);
		}
		
		public void doBtn19()
		{
			DeviceSetType.RemoteMonitor monitor = new DeviceSetType.RemoteMonitor();
			monitor.mPhone = "13510527157";
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_REMOTE_MONITOR_MASID, monitor, this);
		}

		public void doBtn20()
		{
			PublicType.UserChangePwd userChangePwd = new PublicType.UserChangePwd();
//			userChangePwd.mOldPassword = mNetworkCenter.getPwd();
//			userChangePwd.mNewPassword = "111111";
			
			mNetworkCenter.StartRequestToServer(PublicType.USER_CHANGE_PASSWORD_MASID, userChangePwd, this);
		}
		
		public void doBtn21()
		{
			PublicType.UserChangeInfo userInfo = new PublicType.UserChangeInfo();
	
			userInfo.mTrueName = "junjin";
			userInfo.mPhone = "13067306371";
			userInfo.mBirthday = "1990-01-01";
			userInfo.mEmail = "1234567890@qq.com";
			userInfo.mAddr = "google";
			userInfo.mSex = "F";
			
			mNetworkCenter.StartRequestToServer(PublicType.USER_CHANGE_INFO_MASID, userInfo, this);
		}
		
		public void doBtn22()
		{
			
			mNetworkCenter.StartRequestToServer(PublicType.USER_GET_INFO_MASID, null, this);
		}
		
		public void doBtn23()
		{
			
			mNetworkCenter.StartRequestToServer(PublicType.USER_LOGOUIT_MASID, null, this);
		}

		public void doBtn24()
		{
			
			mNetworkCenter.StartRequestToServer(PublicType.USER_HEART_MASID, null, this);
		}

		public void doBtn25()
		{
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_LOCATION_MASID, null, this);
		}
		
		public void doBtn26()
		{
			PublicType.UserBind userBind = new PublicType.UserBind();
			userBind.mUserName = "13923802301";
			userBind.mPassword = "802301";
			mNetworkCenter.StartRequestToServer(PublicType.USER_BIND_MASID, userBind, this);
		}
		
		public void doBtn27()
		{
			
			mNetworkCenter.StartRequestToServer(PublicType.USER_UNBIND_MASID, null, this);
		}
		
		public void doBtn28()
		{
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_ONELINE_MASID, null, this);
		}
		
		public void doBtn29()
		{
			DeviceSetType.DeviceRequestMsg object = new DeviceSetType.DeviceRequestMsg();
			object.mOffset = 0;
			object.mNum = 10;
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_MSG_MASID, object, this);
		}
	
		public void doBtn30()
		{
			
			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_UNREAD_MSG_MASID, null, this);
		}
		
		public void doBtn31()
		{
			
			mNetworkCenter.StartRequestToServer(ProductType.PRODUCT_GET_PACKET_MASID, null, this);
		}
		
		
		public void doBtn32()
		{

			ProductType.CreateOrder createOrderInfo = new ProductType.CreateOrder();
			createOrderInfo.mPackageId = 1;
			createOrderInfo.mPrice = 50;
			createOrderInfo.mTotalFee = 50;
			createOrderInfo.mDid = "2132324343";
			mNetworkCenter.StartRequestToServer(ProductType.PRODUCT_CREATE_ORDER_MASID, createOrderInfo, this);
		}
		
		public void doBtn33()
		{
			DeviceSetType.DeviceArea object = new DeviceSetType.DeviceArea();
			object.mType = "all";
			object.mOffset = 0;
			object.mNum = 10;

			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_AREA_MASID, object, this);
		}
		
		public void doBtn34()
		{
			DeviceSetType.DeviceHistory object = new DeviceSetType.DeviceHistory();
			object.mStartTime = "2012-10-24 00:00:00";
			object.mEndTime = "2012-10-24 17:50:00";

			mNetworkCenter.StartRequestToServer(DeviceSetType.DEVICE_GET_DEVICE_HISTORY_MASID, object, this);
		}
		
		public void doBtn35()
		{
			HttpURLConnection urlConn = null;
			OutputStream out = null;
			InputStream in = null;
			
			try {
							URL url = new URL("http://www.360lbs.net:8080/");
				//				+"{\"data\":{\"endTime\":\"2012-10-24 23:50:00\",\"startTime\":\"2012-10-24 00:00:00\"},\"headers\":{\"ua\":{\"model\":\"HTC EVO 3D X515m\",\"manufacturer\":\"HTC\",\"client_platform\":\"ANDROID\",\"os_version\":\"2.3.4\",\"client_version\":\"1.0.1\"},\"lang\":\"zh_ch\"},\"did\":\"A000000012000086\",\"sid\":\"A128966000007112\",\"cmd\":\"locationget_history\"}");			
					System.out.println(url);
					urlConn = (HttpURLConnection) url.openConnection();		
					//urlConn.setReadTimeout(5000);
					urlConn.setConnectTimeout(5000);
					urlConn.setRequestMethod("POST");
					urlConn.setDoInput(true);
					urlConn.setDoOutput(true);
					urlConn.setUseCaches(false);
					out = urlConn.getOutputStream();
					out.write("json={\"data\":{\"endTime\":\"2012-10-25 20:00:00\",\"startTime\":\"2012-10-25 00:00:00\"},\"headers\":{\"ua\":{\"model\":\"HTC EVO 3D X515m\",\"manufacturer\":\"HTC\",\"client_platform\":\"ANDROID\",\"os_version\":\"2.3.4\",\"client_version\":\"1.0.1\"},\"lang\":\"zh_ch\"},\"did\":\"A000000012000086\",\"sid\":\"A128966000007112\",\"cmd\":\"locationget_history\"}".getBytes("utf-8"));
					out.flush();
					in = urlConn.getInputStream();
					int getContentLen = urlConn.getContentLength();
				//		Thread.sleep(10);
					//log.e("urlConn.getContentLength() = " + getContentLen);
				
					ByteArrayOutputStream bos = null;
					try {
						// 输出图像到客户端
						bos = new ByteArrayOutputStream();
						int i=-1;
						byte[] block = new byte[8192];
						while ((i = in.read(block)) != -1) {
							bos.write(block,0,i);
							block = new byte[8192];
						}
						byte[] bytes = bos.toByteArray();
						System.out.println(bytes.length);
						System.out.println(new String(bytes).trim());
					} finally {
						if (bos != null) {
							bos.close();
						}
					}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
	
		}
		
		public void doBtn36(){
			
			GloalType.DeviceInfoEx device = mApplication.getCurDevice();

			mNetworkCenter.requestHeadFileDown(device, new FileDownCallback());

		}
		
		@Override
		public boolean onComplete(int requestAction,  ResponseDataPacket dataPacket) {
			// TODO Auto-generated method stub

			String jsString = "null";
			if (dataPacket != null)
			{
				jsString = dataPacket.toString();
			}
			
			
			log.e("requestAction = " + Utils.toHexString(requestAction) + "\nResponseDataPacket = \n" +jsString);
			switch(requestAction)
			{
				case DeviceSetType.DEVICE_GET_KEYSET_MASID:
				{
					DeviceSetType.KeySetGroup group = new DeviceSetType.KeySetGroup();
					try {
						group.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_KEYSET_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_CALL_TIME_MASID:
				{
					DeviceSetType.CallTime callTime = new DeviceSetType.CallTime();
					try {
						callTime.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_CALL_TIME_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_WHITELIST_MASID:
				{
					DeviceSetType.WhiteListSetGroup group = new DeviceSetType.WhiteListSetGroup();
					try {
						group.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_WHITELIST_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_CLOCK_MASID:
				{
					DeviceSetType.ClockSetGroup group = new DeviceSetType.ClockSetGroup();
					try {
						group.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_CLOCK_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_SCENEMODE_MASID:
				{
					DeviceSetType.SceneMode sceen = new DeviceSetType.SceneMode();
					try {
						sceen.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_SCENEMODE_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_POWER_MASID:
				{
					DeviceSetType.PowerSet powerSet = new DeviceSetType.PowerSet();
					try {
						powerSet.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_POWER_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_LOWPOWER_WARN_MASID:
				{
					DeviceSetType.LowPowerWarn lowPowerWarn = new DeviceSetType.LowPowerWarn();
					try {
						lowPowerWarn.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_LOWPOWER_WARN_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_GPS_INTERVAL_MASID:
				{
					DeviceSetType.GpsInterval gpsInterval = new DeviceSetType.GpsInterval();
					try {
						gpsInterval.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_GPS_INTERVAL_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_GPS_STILLTIME_MASID:
				{
					DeviceSetType.GpsStillTimeGroup group = new DeviceSetType.GpsStillTimeGroup();
					try {
						group.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_GPS_STILLTIME_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_LOCATION_MASID:
				{
					DeviceSetType.DeviceLocation location = new DeviceSetType.DeviceLocation();
					try {
						location.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_LOCATION_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case PublicType.USER_GET_INFO_MASID:
				{
					PublicType.UserChangeInfo info = new PublicType.UserChangeInfo();
					try {
						info.parseString(dataPacket.data.toString());
						log.e("USER_GET_INFO_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_ONELINE_MASID:
				{
					DeviceSetType.DeviceOnlineStatus status = new DeviceSetType.DeviceOnlineStatus();
					try {
						status.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_ONELINE_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_MSG_MASID:
				{

					DeviceSetType.DeviceMsgDataGroup group = new DeviceSetType.DeviceMsgDataGroup();
					try {
						group.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_MSG_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_UNREAD_MSG_MASID:
				{
					DeviceSetType.DeviceUnReadMsgCount info = new DeviceSetType.DeviceUnReadMsgCount();
					try {
						info.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_UNREAD_MSG_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case ProductType.PRODUCT_GET_PACKET_MASID:
				{
					if (dataPacket != null)
					{
						log.e("ProductType.PRODUCT_GET_PACKET_MASID data = " + dataPacket.data.toString());
					}else{
						log.e("dataPacket = null");
					}
					
					
					ProductType.GetPackageGroup group = new ProductType.GetPackageGroup();
					try {
						group.parseString(dataPacket.data.toString());
						
						List<GetPackage> list = group.mGetPacageList;
						
						log.e("PRODUCT_GET_PACKET_MASID success...size = " + group.mGetPacageList.size());
						int size = list.size();
						for(int i = 0; i < size; i++){
							ProductType.GetPackage info = list.get(i);
							log.e("i = " + i + "\n" + 
									"id = " + info.mID + "\n" + 
									"name = " + info.mName + "\n" + 
								    "price = " + info.mPrice + "\n" + 
									"mValidTime = " + info.mValidTime + "\n" + 
									"mDesc = " + info.mDesc + "\n" + 
									"mDetail = " + info.mDetail);
						}
						
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						log.e("PRODUCT_GET_PACKET_MASID fail...");
					}
				
				}
				break;
				case ProductType.PRODUCT_CREATE_ORDER_MASID:
				{
					ProductType.CreateOrderResult result = new ProductType.CreateOrderResult();
					try {
						result.parseString(dataPacket.data.toString());
						log.e("PRODUCT_CREATE_ORDER_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}
				break;
				case DeviceSetType.DEVICE_GET_AREA_MASID:
				{
					DeviceSetType.DeviceAreaResultGrounp grounp = new DeviceSetType.DeviceAreaResultGrounp();
					
					try {
						grounp.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_AREA_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
				case DeviceSetType.DEVICE_GET_DEVICE_HISTORY_MASID:
				{
					DeviceSetType.DeviceHistoryResultGrounp grounp = new DeviceSetType.DeviceHistoryResultGrounp();
					
					try {
						grounp.parseString(dataPacket.data.toString());
						log.e("DEVICE_GET_DEVICE_HISTORY_MASID success...");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			}
			
			
			return true;
		}
		

		
	    class FileDownCallback extends AbstractTaskCallback{

			@Override
			public void downLoadComplete(boolean isSuccess) {		
				String requestUri = getRequestUri();
				String saveUri = getSaveUri();
				log.e("FileDownCallback isSuccess = " + isSuccess + "\nrequestUri = " + requestUri + 
						"\nsaveUri = " + saveUri);	
			}
	    	
	    }

	    
}
