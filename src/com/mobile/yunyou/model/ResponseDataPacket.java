package com.mobile.yunyou.model;

import org.json.JSONException;
import org.json.JSONObject;

import com.mobile.yunyou.util.CommonLog;
import com.mobile.yunyou.util.LogFactory;

import android.R.string;
import android.util.Log;

public class ResponseDataPacket implements IParseJson{
	private static final CommonLog log = LogFactory.createLog();
	public final static String KEY_RSP = "rsp";
	public final static String KEY_CMD = "cmd";
	public final static String KEY_SID = "sid";
	public final static String KEY_DATA = "data";
	public final static String KEY_ID = "id";
	public final static String KEY_MSG = "msg";
	
    public int rsp = 0;
    public String cmd = "";
    public String sid = "";
    public JSONObject data = new JSONObject();
    public int id = 0;
    public String msg = "";
	@Override
	public boolean parseJson(JSONObject jsonObject) throws JSONException {

		rsp = jsonObject.getInt(KEY_RSP);
		cmd = jsonObject.optString(KEY_CMD, "");
		data = jsonObject.optJSONObject(KEY_DATA);
		if (data == null)
		{
			data = new JSONObject();
		}
		sid = jsonObject.optString(KEY_SID);
		if (sid == null)
		{
			sid = "";
		}
		id = jsonObject.optInt(KEY_ID, 0);
		msg = jsonObject.optString(KEY_MSG, "");
		
	
		return true;
	}
	
	public String toString()
	{
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(KEY_RSP + " = " + rsp + "\n" +
							KEY_CMD + " = " + cmd + "\n" + 
							KEY_SID + " = " + sid + "\n" + 
							KEY_DATA + " = " + data.toString() + "\n" +
							KEY_ID + " = " + id + "\n" + 
							KEY_MSG + " = " + msg + "\n");
		
		
		
		return stringBuffer.toString();
		
	}

}
