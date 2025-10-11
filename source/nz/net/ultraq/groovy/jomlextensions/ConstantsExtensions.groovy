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

import org.joml.Matrix4f
import org.joml.Vector2f
import org.joml.Vector3f
import org.joml.Vector4f

/**
 * Static primitive size constants for the JOML classes.
 *
 * <p>Note that these might not be needed from 1.10.0 as it'll be included in
 * JOML itself, albeit the main package and not the primitives one:
 * https://github.com/JOML-CI/JOML/issues/364
 *
 * @author Emanuel Rabina
 */
class ConstantsExtensions {

	/**
	 * The number of bytes used to represent a {@code Matrix4f}.
	 */
	static int getBYTES(Matrix4f self) {

		return 64 // Matrix4f.FLOATS * Float.BYTES
	}

	/**
	 * The number of bytes used to represent a {@code Vector2f}.
	 */
	static int getBYTES(Vector2f self) {

		return 8 // Vector2f.FLOATS * Float.BYTES
	}

	/**
	 * The number of bytes used to represent a {@code Vector3f}.
	 */
	static int getBYTES(Vector3f self) {

		return 12 // Vector3f.FLOATS * Float.BYTES
	}

	/**
	 * The number of bytes used to represent a {@code Vector4f}.
	 */
	static int getBYTES(Vector4f self) {

		return 16 // Vector4f.FLOATS * Float.BYTES
	}

	/**
	 * The number of floats used to represent a {@code Matrix4f}.
	 */
	static int getFLOATS(Matrix4f self) {

		return 16
	}

	/**
	 * The number of floats used to represent a {@code Vector2f}.
	 */
	static int getFLOATS(Vector2f self) {

		return 2
	}

	/**
	 * The number of floats used to represent a {@code Vector3f}.
	 */
	static int getFLOATS(Vector3f self) {

		return 3
	}

	/**
	 * The number of floats used to represent a {@code Vector4f}.
	 */
	static int getFLOATS(Vector4f self) {

		return 4
	}
}
