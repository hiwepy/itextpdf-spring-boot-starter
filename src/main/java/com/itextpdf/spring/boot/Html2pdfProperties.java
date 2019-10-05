/*
 * Copyright (c) 2018, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.itextpdf.spring.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(Html2pdfProperties.PREFIX)
public class Html2pdfProperties {

	public static final String PREFIX = "spring.itext.html2pdf";
 
	/**
	 * use true if you want to register the standard Type 1 fonts (can't be embedded)
	 */
	public boolean registerStandardPdfFonts = true;
	/**
	 * use true if you want to register the shipped fonts (can be embedded)
	 */
	public boolean registerShippedFreeFonts = true;
	/**
	 * use true if you want to register the system fonts (can require quite some resources)
	 */
	public boolean registerSystemFonts = false;

}
