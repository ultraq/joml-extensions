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

/**
 * Extensions to the {@link Rectanglef} class.
 *
 * @author Emanuel Rabina
 */
class RectanglefExtensions {

	/**
	 * Update a rectangle's values so each point is equidistant from the origin
	 * (0, 0).
	 */
	static Rectanglef center(Rectanglef self) {

		var halfLengthX = self.lengthX() / 2f as float
		var halfLengthY = self.lengthY() / 2f as float
		return set(self, -halfLengthX, -halfLengthY, halfLengthX, halfLengthY)
	}

	/**
	 * Expand the borders of a rectangle to include another rectangle.
	 */
	static Rectanglef expand(Rectanglef self, Rectanglef other) {

		return expand(self, other.minX, other.minY, other.maxX, other.maxY)
	}

	/**
	 * Expand the borders of a rectangle to include a given points representing
	 * another rectangle.
	 */
	static Rectanglef expand(Rectanglef self, float minX, float minY, float maxX, float maxY) {

		return self
			.setMin(Math.min(self.minX, minX), Math.min(self.minY, minY))
			.setMax(Math.max(self.maxX, maxX), Math.max(self.maxY, maxY))
	}

	/**
	 * Set a rectangle to represent the given values.
	 */
	static Rectanglef set(Rectanglef self, float minX, float minY, float maxX, float maxY) {

		self.minX = minX
		self.minY = minY
		self.maxX = maxX
		self.maxY = maxY
		return self
	}

	/**
	 * Set the length parts of a rectangle, adjusting {@code maxX}/{@code maxY} so
	 * that they create the given lengths.
	 */
	static Rectanglef setLengths(Rectanglef self, float lengthX, float lengthY) {

		return self.setMax(self.minX + lengthX as float, self.minY + lengthY as float)
	}
}
