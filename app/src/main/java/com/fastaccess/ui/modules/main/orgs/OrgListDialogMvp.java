package com.fastaccess.ui.modules.main.orgs;

import android.support.annotation.NonNull;

import com.fastaccess.data.dao.model.User;
import com.fastaccess.ui.base.mvp.BaseMvp;

import java.util.ArrayList;

/**
 * Created by Kosh on 15 Apr 2017, 1:53 PM
 */

public interface OrgListDialogMvp {

    interface View extends BaseMvp.FAView {
        void onNotifyAdapter();

        void onNoOrgs();
    }

    interface Presenter {
        void onLoadOrgs();

        @NonNull ArrayList<User> getOrgs();
    }
}