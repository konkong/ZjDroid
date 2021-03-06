package app.songy.com.zjdroid.request;

import java.util.HashMap;
import java.util.Iterator;

import app.songy.com.zjdroid.collecter.DexFileInfo;
import app.songy.com.zjdroid.collecter.DexFileInfoCollecter;
import app.songy.com.zjdroid.util.Logger;

public class DumpDexInfoCommandHandler implements CommandHandler {

	@Override
	public void doAction() {
		HashMap<String, DexFileInfo> dexfileInfo = DexFileInfoCollecter.getInstance().dumpDexFileInfo();
		Iterator<DexFileInfo> itor = dexfileInfo.values().iterator();
		DexFileInfo info = null;
		Logger.log("The DexFile Infomation ->");
		while (itor.hasNext()) {
			info = itor.next();
			Logger.log("filepath:"+ info.getDexPath()+" mCookie:"+info.getmCookie());
		}
		Logger.log("End DexFile Infomation");
	}

}
