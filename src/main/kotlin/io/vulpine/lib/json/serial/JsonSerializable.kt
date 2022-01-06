package io.vulpine.lib.json.serial

import com.fasterxml.jackson.databind.JsonNode

/**
 * Json Serializable Type
 *
 * Represents a type that can be serialized to a Jackson [JsonNode].
 *
 * @author Elizabeth Paige Harper [foxcapades.io@gmail.com]
 * @since v1.0.0
 */
interface JsonSerializable {

  /**
   * Converts this object into a JsonNode.
   *
   * This method should be idempotent based on the state of the implementing
   * object.
   *
   * @return The serialized Json form of this object.
   */
  fun toJson(): JsonNode
}