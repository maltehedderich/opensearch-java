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

package org.opensearch.clients.opensearch.core;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.JsonpSerializer;
import org.opensearch.clients.json.JsonpUtils;
import org.opensearch.clients.json.NamedDeserializer;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;

import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: _global.scripts_painless_execute.Response

@JsonpDeserializable
public class ScriptsPainlessExecuteResponse<TResult> implements JsonpSerializable {
	private final TResult result;

	@Nullable
	private final JsonpSerializer<TResult> tResultSerializer;

	// ---------------------------------------------------------------------------------------------

	private ScriptsPainlessExecuteResponse(Builder<TResult> builder) {

		this.result = ApiTypeHelper.requireNonNull(builder.result, this, "result");
		this.tResultSerializer = builder.tResultSerializer;

	}

	public static <TResult> ScriptsPainlessExecuteResponse<TResult> of(
			Function<Builder<TResult>, ObjectBuilder<ScriptsPainlessExecuteResponse<TResult>>> fn) {
		return fn.apply(new Builder<>()).build();
	}

	/**
	 * Required - API name: {@code result}
	 */
	public final TResult result() {
		return this.result;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("result");
		JsonpUtils.serialize(this.result, generator, tResultSerializer, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ScriptsPainlessExecuteResponse}.
	 */

	public static class Builder<TResult> extends ObjectBuilderBase
			implements
				ObjectBuilder<ScriptsPainlessExecuteResponse<TResult>> {
		private TResult result;

		@Nullable
		private JsonpSerializer<TResult> tResultSerializer;

		/**
		 * Required - API name: {@code result}
		 */
		public final Builder<TResult> result(TResult value) {
			this.result = value;
			return this;
		}

		/**
		 * Serializer for TResult. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public final Builder<TResult> tResultSerializer(@Nullable JsonpSerializer<TResult> value) {
			this.tResultSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link ScriptsPainlessExecuteResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ScriptsPainlessExecuteResponse<TResult> build() {
			_checkSingleUse();

			return new ScriptsPainlessExecuteResponse<TResult>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a JSON deserializer for ScriptsPainlessExecuteResponse
	 */
	public static <TResult> JsonpDeserializer<ScriptsPainlessExecuteResponse<TResult>> createScriptsPainlessExecuteResponseDeserializer(
			JsonpDeserializer<TResult> tResultDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TResult>>) Builder::new,
				op -> ScriptsPainlessExecuteResponse.setupScriptsPainlessExecuteResponseDeserializer(op,
						tResultDeserializer));
	};

	/**
	 * Json deserializer for {@link ScriptsPainlessExecuteResponse} based on named
	 * deserializers provided by the calling {@code JsonMapper}.
	 */
	public static final JsonpDeserializer<ScriptsPainlessExecuteResponse<Object>> _DESERIALIZER =
			createScriptsPainlessExecuteResponseDeserializer(
			new NamedDeserializer<>("co.elastic.clients:Deserializer:_global.scripts_painless_execute.TResult"));

	protected static <TResult> void setupScriptsPainlessExecuteResponseDeserializer(
			ObjectDeserializer<ScriptsPainlessExecuteResponse.Builder<TResult>> op,
			JsonpDeserializer<TResult> tResultDeserializer) {

		op.add(Builder::result, tResultDeserializer, "result");

	}

}