/*
 * Copyright (C) 2014 The Jfat Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package cn.jfat.commons.base;

/**
 * <P>异常工具包</P>
 * @author xunaidong
 * @since 0.1
 */
public final class ExceptionUtils {
	
	private ExceptionUtils(){}
	
   /**
	* 判断是否是checked异常 
	* <pre class="code">RuntimeException && Error are not CheckedException</pre>
	* @see RuntimeException
	* @see Error
	* @param ex	
	* @return boolean
	*/
	public static boolean isCheckedException(Throwable ex) {
		return !(ex instanceof RuntimeException || ex instanceof Error);
	}
	
	/**
	 * 检查给定的异常是否符合指定的异常类型,用在<code>try catch</code>
	 * 待校验的异常必须是checkedException
	 * @param ex the exception to check
	 * @param declaredExceptions the exception types declared in the throws clause
	 * @return whether the given exception is compatible
	 */
	public static boolean isCompatibleWithThrowsClause(Throwable ex, Class<?>... declaredExceptions) {
		if (!isCheckedException(ex)) {
			return true;
		}
		if (declaredExceptions != null) {
			for (Class<?> declaredException : declaredExceptions) {
				if (declaredException.isInstance(ex)) {
					return true;
				}
			}
		}
		return false;
	}  
	/**
	 * 普通异常转换为RuntimeException,注意如果待转换异常本身即为UncheckedExcetion,
	 * 则会被向上转型
	 * @param ex
	 * @return {@link RuntimePermission}
	 */
	public static RuntimeException changeToUncheckedExcetion(Throwable ex){
		if (RuntimeException.class.isInstance(ex)) {
			return (RuntimeException)ex;
		}
		return new RuntimeException(ex);
	}

}
