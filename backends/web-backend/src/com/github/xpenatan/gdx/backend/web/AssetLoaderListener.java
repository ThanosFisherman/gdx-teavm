package com.github.xpenatan.gdx.backend.web;

public class AssetLoaderListener<T>
{
	public void onProgress(double amount){}

	public void onFailure(String url){}

	public void onSuccess(String url, T result){}
}