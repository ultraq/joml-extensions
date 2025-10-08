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

import org.joml.primitives.Rectanglef
import spock.lang.Specification

/**
 * Tests for the {@link RectanglefExtensions} methods.
 *
 * @author Emanuel Rabina
 */
class RectanglefExtensionsTests extends Specification {

	def 'Expand the borders of a rectangle to include another rectangle'() {
		given:
			var rect = new Rectanglef(0, 0, 3, 4)
		when:
			rect.expand(new Rectanglef(1, 1, 5, 6))
		then:
			rect.minX == 0
			rect.minY == 0
			rect.maxX == 5
			rect.maxY == 6
	}

	def 'Set all values in one method call'() {
		given:
			var rect = new Rectanglef()
		when:
			rect.set(1, 2, 3, 4)
		then:
			rect.minX == 1
			rect.minY == 2
			rect.maxX == 3
			rect.maxY == 4
	}

	def 'Set lengths'() {
		given:
			var rect = new Rectanglef(2, 2, 4, 4)
		when:
			rect.setLengths(3, 3)
		then:
			rect.minX == 2
			rect.minY == 2
			rect.maxX == 5
			rect.maxY == 5
	}
}
