package org.cpputest.parser;

import org.cpputest.parser.langunit.CppLangFunctionSignature;

public class CppSourceCodeReader implements SourceCodeReader {

	@Override
	public void read(String sourceCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public Iterable<CppLangFunctionSignature> signatures(String sourceCode) {
		return new SignatureIterable(sourceCode);
	}

}