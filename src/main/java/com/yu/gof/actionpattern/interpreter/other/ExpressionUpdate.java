package com.yu.gof.actionpattern.interpreter.other;

public class ExpressionUpdate implements Expression {

	@Override
	public String interpret(Context context) {
		
		StringBuilder update = new StringBuilder();
		update.append("update ").append(context.getTableName()).append(" set ");
		
		StringBuilder values = new StringBuilder();
		for (String key : context.getParams().keySet()) {
			values.append(key).append(" = '").append(context.getParams().get(key)).append("',");
		}
		
		StringBuilder wheres = new StringBuilder();
		wheres.append(" 1 = 1 ");
		for (String key : context.getWheres().keySet()) {
			wheres.append(" and ").append(key).append(" = '").append(context.getWheres().get(key)).append("'");
		}
		
		//拼接
		update.append(values.substring(0, values.length() - 1)).append(" where ").append(wheres);
		
		return update.toString();
	}

}
