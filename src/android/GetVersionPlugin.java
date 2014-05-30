package com.kalengo.weathermeida.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import com.kalengo.weathermeida.ui.MyApplication;
import com.kalengo.weathermeida.util.UrlUtil;

/**
 * @author Administrator 获取应用版本号
 */
public class GetVersionPlugin extends CordovaPlugin {
	public static String GetVersion = "get";

	public boolean execute(String action, JSONArray data,
			CallbackContext callbackContext) throws JSONException {
		UrlUtil.info("david", "getversion---" + action);
		if (GetVersion.equals(action)) {
			MyApplication application = (MyApplication) this.cordova
					.getActivity().getApplication();
			callbackContext.success(application.getJsonVersion());
			return true;
		}
		return false;
	}

}
