package com.appbyme.app272523.main.base.listener;

import android.content.Context;

import com.appbyme.app272523.base.util.jump.JumpArticleUtils;
import com.appbyme.app272523.base.util.jump.JumpForumUtils;
import com.appbyme.app272523.base.util.jump.JumpThreadUtils;
import com.appbyme.app272523.base.util.jump.JumpWebUtils;
import com.youzu.clan.base.enums.HomeConfigItemType;
import com.youzu.clan.base.json.homeconfig.HomeConfigItem;

/**
 * Created by Zhao on 15/7/1.
 */
public class DoHomeCofigOnClick {

    public static void doClick(Context context, HomeConfigItem item) {
        switch (item.getType()) {
            case HomeConfigItemType.LINK:
                JumpWebUtils.gotoWeb(context, "", item.getUrl());
                break;

            case HomeConfigItemType.THREAD:
                JumpThreadUtils.gotoThreadDetail(context, item.getPid());
                break;

            case HomeConfigItemType.FORUM:
                JumpForumUtils.gotoForum(context, item.getTitle(), item.getPid());
                break;
            case HomeConfigItemType.ARTICLE:
                JumpArticleUtils.gotoArticleDetail(context,item.getPid());
                break;
            case HomeConfigItemType.CATEGORY:
                JumpArticleUtils.gotoArticleList(context,item.getPid(),item.getTitle());
                break;
        }
    }

}
