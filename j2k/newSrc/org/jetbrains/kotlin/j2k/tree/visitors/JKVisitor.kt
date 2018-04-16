package org.jetbrains.kotlin.j2k.tree.visitors

import org.jetbrains.kotlin.j2k.tree.*

interface JKVisitor<out R, in D> {
    fun visitElement(element: JKElement, data: D): R 
    fun visitUniverseDeclaration(universeDeclaration: JKUniverseDeclaration, data: D): R = visitElement(universeDeclaration, data)
    fun visitUniverseClass(universeClass: JKUniverseClass, data: D): R = visitUniverseDeclaration(universeClass, data)
    fun visitModifier(modifier: JKModifier, data: D): R = visitElement(modifier, data)
    fun visitModifierList(modifierList: JKModifierList, data: D): R = visitElement(modifierList, data)
    fun visitAccessModifier(accessModifier: JKAccessModifier, data: D): R = visitModifier(accessModifier, data)
    fun visitModalityModifier(modalityModifier: JKModalityModifier, data: D): R = visitModifier(modalityModifier, data)
    fun visitReference(reference: JKReference, data: D): R = visitElement(reference, data)
    fun visitMethodReference(methodReference: JKMethodReference, data: D): R = visitReference(methodReference, data)
    fun visitFieldReference(fieldReference: JKFieldReference, data: D): R = visitReference(fieldReference, data)
    fun visitClassReference(classReference: JKClassReference, data: D): R = visitReference(classReference, data)
    fun visitType(type: JKType, data: D): R = visitElement(type, data)
    fun visitClassType(classType: JKClassType, data: D): R = visitType(classType, data)
    fun visitStatement(statement: JKStatement, data: D): R = visitElement(statement, data)
    fun visitLoop(loop: JKLoop, data: D): R = visitStatement(loop, data)
    fun visitBlock(block: JKBlock, data: D): R = visitElement(block, data)
    fun visitIdentifier(identifier: JKIdentifier, data: D): R = visitElement(identifier, data)
    fun visitNameIdentifier(nameIdentifier: JKNameIdentifier, data: D): R = visitIdentifier(nameIdentifier, data)
    fun visitExpression(expression: JKExpression, data: D): R = visitElement(expression, data)
    fun visitExpressionStatement(expressionStatement: JKExpressionStatement, data: D): R = visitStatement(expressionStatement, data)
    fun visitBinaryExpression(binaryExpression: JKBinaryExpression, data: D): R = visitExpression(binaryExpression, data)
    fun visitUnaryExpression(unaryExpression: JKUnaryExpression, data: D): R = visitExpression(unaryExpression, data)
    fun visitPrefixExpression(prefixExpression: JKPrefixExpression, data: D): R = visitUnaryExpression(prefixExpression, data)
    fun visitPostfixExpression(postfixExpression: JKPostfixExpression, data: D): R = visitUnaryExpression(postfixExpression, data)
    fun visitQualifiedExpression(qualifiedExpression: JKQualifiedExpression, data: D): R = visitExpression(qualifiedExpression, data)
    fun visitMethodCallExpression(methodCallExpression: JKMethodCallExpression, data: D): R = visitExpression(methodCallExpression, data)
    fun visitFieldAccessExpression(fieldAccessExpression: JKFieldAccessExpression, data: D): R = visitExpression(fieldAccessExpression, data)
    fun visitArrayAccessExpression(arrayAccessExpression: JKArrayAccessExpression, data: D): R = visitExpression(arrayAccessExpression, data)
    fun visitParenthesizedExpression(parenthesizedExpression: JKParenthesizedExpression, data: D): R = visitExpression(parenthesizedExpression, data)
    fun visitTypeCastExpression(typeCastExpression: JKTypeCastExpression, data: D): R = visitExpression(typeCastExpression, data)
    fun visitExpressionList(expressionList: JKExpressionList, data: D): R = visitElement(expressionList, data)
    fun visitLiteralExpression(literalExpression: JKLiteralExpression, data: D): R = visitExpression(literalExpression, data)
    fun visitValueArgument(valueArgument: JKValueArgument, data: D): R = visitElement(valueArgument, data)
    fun visitStringLiteralExpression(stringLiteralExpression: JKStringLiteralExpression, data: D): R = visitLiteralExpression(stringLiteralExpression, data)
    fun visitJavaField(javaField: JKJavaField, data: D): R = visitUniverseDeclaration(javaField, data)
    fun visitJavaMethod(javaMethod: JKJavaMethod, data: D): R = visitUniverseDeclaration(javaMethod, data)
    fun visitJavaForLoop(javaForLoop: JKJavaForLoop, data: D): R = visitLoop(javaForLoop, data)
    fun visitJavaAssignmentExpression(javaAssignmentExpression: JKJavaAssignmentExpression, data: D): R = visitExpression(javaAssignmentExpression, data)
    fun visitJavaPrimitiveType(javaPrimitiveType: JKJavaPrimitiveType, data: D): R = visitType(javaPrimitiveType, data)
    fun visitJavaArrayType(javaArrayType: JKJavaArrayType, data: D): R = visitType(javaArrayType, data)
    fun visitJavaMethodCallExpression(javaMethodCallExpression: JKJavaMethodCallExpression, data: D): R = visitMethodCallExpression(javaMethodCallExpression, data)
    fun visitJavaFieldAccessExpression(javaFieldAccessExpression: JKJavaFieldAccessExpression, data: D): R = visitFieldAccessExpression(javaFieldAccessExpression, data)
    fun visitJavaNewExpression(javaNewExpression: JKJavaNewExpression, data: D): R = visitExpression(javaNewExpression, data)
    fun visitJavaAccessModifier(javaAccessModifier: JKJavaAccessModifier, data: D): R = visitAccessModifier(javaAccessModifier, data)
    fun visitJavaModifier(javaModifier: JKJavaModifier, data: D): R = visitModifier(javaModifier, data)
    fun visitJavaNewEmptyArray(javaNewEmptyArray: JKJavaNewEmptyArray, data: D): R = visitExpression(javaNewEmptyArray, data)
    fun visitJavaNewArray(javaNewArray: JKJavaNewArray, data: D): R = visitExpression(javaNewArray, data)
    fun visitJavaLiteralExpression(javaLiteralExpression: JKJavaLiteralExpression, data: D): R = visitLiteralExpression(javaLiteralExpression, data)
    fun visitKtProperty(ktProperty: JKKtProperty, data: D): R = visitUniverseDeclaration(ktProperty, data)
    fun visitKtFunction(ktFunction: JKKtFunction, data: D): R = visitUniverseDeclaration(ktFunction, data)
    fun visitKtConstructor(ktConstructor: JKKtConstructor, data: D): R = visitUniverseDeclaration(ktConstructor, data)
    fun visitKtPrimaryConstructor(ktPrimaryConstructor: JKKtPrimaryConstructor, data: D): R = visitKtConstructor(ktPrimaryConstructor, data)
    fun visitKtAssignmentStatement(ktAssignmentStatement: JKKtAssignmentStatement, data: D): R = visitStatement(ktAssignmentStatement, data)
    fun visitKtCall(ktCall: JKKtCall, data: D): R = visitMethodCallExpression(ktCall, data)
    fun visitKtModifier(ktModifier: JKKtModifier, data: D): R = visitModifier(ktModifier, data)
    fun visitKtMethodCallExpression(ktMethodCallExpression: JKKtMethodCallExpression, data: D): R = visitMethodCallExpression(ktMethodCallExpression, data)
    fun visitKtFieldAccessExpression(ktFieldAccessExpression: JKKtFieldAccessExpression, data: D): R = visitFieldAccessExpression(ktFieldAccessExpression, data)
    fun visitKtLiteralExpression(ktLiteralExpression: JKKtLiteralExpression, data: D): R = visitLiteralExpression(ktLiteralExpression, data)
}