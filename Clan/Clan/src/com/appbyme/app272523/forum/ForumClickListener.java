package com.appbyme.app272523.forum;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;

import com.appbyme.app272523.base.util.jump.JumpThreadUtils;

public class ForumClickListener implements OnClickListener {
	private Context mContext;
	private String mTid;
	
	public ForumClickListener(Context context, String tid) {
		mContext = context;
		mTid = tid;
	}

	@Override
	public void onClick(View widget) {
//		ClanUtils.showDetail(mContext, mTid);
		JumpThreadUtils.gotoThreadDetail(mContext,mTid);
	}

}
