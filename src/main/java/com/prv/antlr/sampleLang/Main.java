package com.prv.antlr.sampleLang;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import com.prv.antlr.sampleLang.generated.SampleLangLexer;
import com.prv.antlr.sampleLang.generated.SampleLangParser;

public class Main {

	public static void main(String[] args) {
		ANTLRInputStream input = new ANTLRInputStream("get entity asf");

		SampleLangLexer lexer = new SampleLangLexer(input);
		SampleLangParser parser = new SampleLangParser(new CommonTokenStream(lexer));
		parser.addParseListener(new SampleLangListener());

		// Start parsing
		parser.statement();
	}

}
