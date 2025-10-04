/*
 * Copyright 2025, Emanuel Rabina (http://www.ultraq.net.nz/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nz.net.ultraq.groovy.jomlextensions

import org.joml.primitives.AABBf
import org.joml.primitives.AABBfc

/**
 * Extensions to the {@link AABBf} class.
 *
 * @author Emanuel Rabina
 */
class AABBfExtensions {

	/**
	 * Expand the borders of an AABB to include another AABB.
	 */
	static AABBf expand(AABBf self, AABBfc other) {

		return self
			.setMin(Math.min(self.minX, other.minX()), Math.min(self.minY, other.minY()), Math.min(self.minZ, other.minZ()))
			.setMax(Math.max(self.maxX, other.maxX()), Math.max(self.maxY, other.maxY()), Math.max(self.maxZ, other.maxZ()))
	}

	/**
	 * Set an AABB to represent the given values.
	 */
	static AABBf set(AABBf self, float minX, float minY, float minZ, float maxX, float maxY, float maxZ) {

		return self
			.setMin(minX, minY, minZ)
			.setMax(maxX, maxY, maxZ)
	}
}
