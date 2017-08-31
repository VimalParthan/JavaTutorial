package com.vimal;

public class Button {
	
	private String title;
	private OnClickListener onClickListner;
	
	public Button(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setOnClickListner(OnClickListener onClickListner){
		this.onClickListner = onClickListner;
	}
	
	public void onClick(){
		this.onClickListner.onClick(this.title);
	}
	
	public interface OnClickListener{
		public void onClick(String title);
	}
}
