package io.vulpine.lib.json.serial

import com.fasterxml.jackson.databind.JsonNode

/**
 * Json Populatable Type
 *
 * Represents a type that can be populated from a Jackson [JsonNode].
 *
 * @author Elizabeth Paige Harper [foxcapades.io@gmail.com]
 * @since v1.0.0
 */
interface JsonPopulatable<J: JsonNode> {

  /**
   * Populates the implementing object from the given JsonNode of type [J].
   *
   * This method should be idempotent.
   *
   * @param json The JsonNode of type [J].
   */
  fun jsonFill(json: J)
}