/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.format.datetime.joda;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.format.Parser;

import java.text.ParseException;
import java.util.Locale;

/**
 * Parses Joda {@link LocalDate} instances using a
 * {@link DateTimeFormatter}.
 *
 * @author Juergen Hoeller
 * @since 4.0
 */
public final class LocalDateParser implements Parser<LocalDate> {

	private final DateTimeFormatter formatter;


	/**
	 * Create a new DateTimeParser.
	 * @param formatter the Joda DateTimeFormatter instance
	 */
	public LocalDateParser(DateTimeFormatter formatter) {
		this.formatter = formatter;
	}


	@Override
	public LocalDate parse(String text, Locale locale) throws ParseException {
		return JodaTimeContextHolder.getFormatter(this.formatter, locale).parseLocalDate(text);
	}

}
