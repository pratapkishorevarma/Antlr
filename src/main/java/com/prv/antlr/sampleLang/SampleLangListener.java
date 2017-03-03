package com.prv.antlr.sampleLang;

import com.prv.antlr.sampleLang.generated.SampleLangBaseListener;
import com.prv.antlr.sampleLang.generated.SampleLangParser.CreateContext;
import com.prv.antlr.sampleLang.generated.SampleLangParser.DeleteContext;
import com.prv.antlr.sampleLang.generated.SampleLangParser.GetContext;

public class SampleLangListener extends SampleLangBaseListener {

	@Override
	public void exitCreate(CreateContext ctx) {
		System.out.println("Created " + ctx.NAME().getText());
	}

	@Override
	public void exitDelete(DeleteContext ctx) {
		System.out.println("Deleted " + ctx.NAME().getText());
	}

	@Override
	public void exitGet(GetContext ctx) {
		System.out.println("Get " + ctx.NAME().getText());
	}

}
