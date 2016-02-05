package com.apphunger.chobo1.adapter;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apphunger.chobo1.R;
import com.apphunger.chobo1.TasteVO;
import com.apphunger.chobo1.adapter.holder.MemoHolder;

import java.util.List;

public class MemoListAdapter extends RecyclerView.Adapter<MemoHolder> {

	private Context context;
	private List<TasteVO> itemList;

	public MemoListAdapter(Context context, List<TasteVO> itemList) {
		this.context = context;
		this.itemList = itemList;
	}

	@Override
	public MemoHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
		View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_memo, viewGroup, false);
		return new MemoHolder(view);
	}



	@Override
	public void onBindViewHolder(MemoHolder holder, final int position) {
		//holder.idTextView.setText(String.valueOf(itemList.get(position).getId()));
		//holder.memoTextView.setText(itemList.get(position).getMemo());
		holder.regDateTextView.setText(itemList.get(position).getRegdate());
		holder.itemLayout.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//IntentHandler.moveToMemoActivity(context, itemList.get(position));
			}
		});
	}

	@Override
	public int getItemCount() {
		return (itemList.size() > 0) ? itemList.size() : 0;
	}

}
