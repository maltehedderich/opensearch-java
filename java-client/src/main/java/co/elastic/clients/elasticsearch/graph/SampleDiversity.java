/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.graph;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: graph._types.SampleDiversity
public final class SampleDiversity implements ToJsonp {
	private final String field;

	private final Number maxDocsPerValue;

	// ---------------------------------------------------------------------------------------------

	protected SampleDiversity(Builder builder) {

		this.field = Objects.requireNonNull(builder.field, "field");
		this.maxDocsPerValue = Objects.requireNonNull(builder.maxDocsPerValue, "max_docs_per_value");

	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code max_docs_per_value}
	 */
	public Number maxDocsPerValue() {
		return this.maxDocsPerValue;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("max_docs_per_value");
		generator.write(this.maxDocsPerValue.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SampleDiversity}.
	 */
	public static class Builder implements ObjectBuilder<SampleDiversity> {
		private String field;

		private Number maxDocsPerValue;

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code max_docs_per_value}
		 */
		public Builder maxDocsPerValue(Number value) {
			this.maxDocsPerValue = value;
			return this;
		}

		/**
		 * Builds a {@link SampleDiversity}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SampleDiversity build() {

			return new SampleDiversity(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for SampleDiversity
	 */
	public static final JsonpValueParser<SampleDiversity> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, SampleDiversity::setupSampleDiversityParser);

	protected static void setupSampleDiversityParser(DelegatingJsonpValueParser<SampleDiversity.Builder> op) {

		op.add(Builder::field, JsonpValueParser.stringParser(), "field");
		op.add(Builder::maxDocsPerValue, JsonpValueParser.numberParser(), "max_docs_per_value");

	}

}