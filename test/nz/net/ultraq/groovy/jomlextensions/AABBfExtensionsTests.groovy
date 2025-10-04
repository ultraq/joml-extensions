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
import spock.lang.Specification

/**
 * Tests for the {@link AABBfExtensions} methods.
 *
 * @author Emanuel Rabina
 */
class AABBfExtensionsTests extends Specification {

	def 'Expand the borders of an AABB to include another AABB'() {
		given:
			var boundingBox = new AABBf(0, 0, 0, 5, 6, 7)
		when:
			boundingBox.expand(new AABBf(1, 1, 1, 8, 9, 10))
		then:
			boundingBox.minX == 0
			boundingBox.minY == 0
			boundingBox.minZ == 0
			boundingBox.maxX == 8
			boundingBox.maxY == 9
			boundingBox.maxZ == 10
	}
}
