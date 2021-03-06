package com.ryan.simplechatview.demo;

import android.view.View;
import android.widget.TextView;

import com.ryan.baselib.util.AppUtils;
import com.ryan.simplechatview.R;
import com.ryan.simplechatview.lib.BaseChatViewHolder;
import com.ryan.simplechatview.lib.MyChatMsg;

public class HeaderChatHolder extends BaseChatViewHolder {

    public HeaderChatHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindData(MyChatMsg data, int position) {
        TextView tips = (TextView) getView(R.id.tv_header_text_msg);
        tips.setText(AppUtils.getContext().getResources().getString(R.string.test_healthy_live));
    }
}
