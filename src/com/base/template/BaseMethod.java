package com.base.template;

public abstract class BaseMethod {

	public Object baseMethod(String json) {
		// 判断参数
				if (null == json && json.length() == 0) {
					return null;
				}
				//
				doAMethod();
				doBMethod();
				// 验证
				try {
					
				} catch (Exception e) {

				}
				
				if(!istrue()) {
					//
					return null;
				}
				return null;
	}

	private boolean istrue() {
		// TODO Auto-generated method stub
		return false;
	}

	protected abstract void doBMethod();

	protected abstract void doAMethod();
}
