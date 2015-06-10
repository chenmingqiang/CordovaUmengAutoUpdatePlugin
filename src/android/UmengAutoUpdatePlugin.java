package com.tulip.cordova;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.umeng.update.UmengUpdateAgent;
import com.umeng.update.UmengUpdateListener;
import com.umeng.update.UpdateConfig;
import com.umeng.update.UpdateResponse;
import com.umeng.update.UpdateStatus;
//import com.tulip.doctor_appointment.R;

public class UmengAutoUpdatePlugin extends CordovaPlugin {
	private static Context mContext;

	@Override
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		mContext = this.cordova.getActivity().getApplicationContext();
	}

	@Override
	public boolean execute(String action, JSONArray data,
			CallbackContext callbackContext) throws JSONException {
		if (action.equals("update")) {
			update();
		}

		/*
		 else if (action.equals("setDeltaUpdate")) {
			boolean deltaUpdate = data.getBoolean(0);
			setDeltaUpdate(deltaUpdate);
		}
		*/

		callbackContext.success();
		return true;
	}

	void update() {
		UmengUpdateAgent.update(mContext);
	}

	/*
	void setDeltaUpdate(boolean deletaUpdate) {
		UmengUpdateAgent.setDeltaUpdate(deletaUpdate);
	}
	*/
}
