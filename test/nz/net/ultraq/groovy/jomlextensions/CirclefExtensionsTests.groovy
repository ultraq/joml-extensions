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

import org.joml.primitives.Circlef
import spock.lang.Specification

/**
 * Tests for the {@link CirclefExtensions} methods.
 *
 * @author Emanuel Rabina
 */
class CirclefExtensionsTests extends Specification {

	def 'Check if two circles intersect'(Circlef circle1, Circlef circle2) {
		expect:
			circle1.intersects(circle2)
		where:
			// @formatter:off
			circle1 << [new Circlef(0f, 0f, 1f), new Circlef(-1f, 0f, 1f)]
			circle2 << [new Circlef(0f, 0f, 1f), new Circlef( 1f, 0f, 1f)]
			// @formatter:on
	}
}
