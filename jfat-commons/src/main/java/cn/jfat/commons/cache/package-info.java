/*
 * Copyright (C) 2011 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * This package contains caching utilities.
 *
 * <p>The core interface used to represent caches is {@link cn.jfat.commons.cache.Cache}.
 * In-memory caches can be configured and created using
 * {@link cn.jfat.commons.cache.CacheBuilder}, with cache entries being loaded by
 * {@link cn.jfat.commons.cache.CacheLoader}. Statistics about cache performance are exposed using
 * {@link cn.jfat.commons.cache.CacheStats}.
 * 
 * <p>See the Guava User Guide article on <a href=
 * "http://code.google.com/p/guava-libraries/wiki/CachesExplained">caches</a>.
 *
 * <p>This package is a part of the open-source
 * <a href="http://guava-libraries.googlecode.com">Guava libraries</a>.
 *
 * @author Charles Fry
 */
@ParametersAreNonnullByDefault
package cn.jfat.commons.cache;

import javax.annotation.ParametersAreNonnullByDefault;

