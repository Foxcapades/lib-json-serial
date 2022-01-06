package io.vulpine.lib.json.serial

import com.fasterxml.jackson.databind.JsonNode

/**
 * Json Deserializable Type
 *
 * Represents a type that can be deserialized from a Jackson [JsonNode].
 *
 * This type is intended to be implemented by Kotlin companion objects to
 * deserialize and instantiate the parent/containing type.
 *
 * @author Elizabeth Paige Harper [foxcapades.io@gmail.com]
 * @since v1.0.0
 */
interface JsonDeserializable<J : JsonNode, out T> {

  /**
   * Creates a new instance of [T] from the given JsonNode of type [J].
   *
   * This method should be idempotent.
   *
   * @param json Input `JsonNode` of type [J].
   *
   * @return The new instance of [T] deserialized from the given [JsonNode]
   */
  fun fromJson(json: J): T
}