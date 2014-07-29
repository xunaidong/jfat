/*
 * Copyright (C) 2007 The Guava Authors
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
 * This package contains generic collection interfaces and implementations, and
 * other utilities for working with collections. It is a part of the open-source
 * <a href="http://guava-libraries.googlecode.com">Guava libraries</a>.
 *
 * <h2>Collection Types</h2>
 *
 * <dl>
 * <dt>{@link cn.jfat.commons.collect.BiMap}
 * <dd>An extension of {@link java.util.Map} that guarantees the uniqueness of
 *     its values as well as that of its keys. This is sometimes called an
 *     "invertible map," since the restriction on values enables it to support
 *     an {@linkplain cn.jfat.commons.collect.BiMap#inverse inverse view} --
 *     which is another instance of {@code BiMap}.
 *
 * <dt>{@link cn.jfat.commons.collect.Multiset}
 * <dd>An extension of {@link java.util.Collection} that may contain duplicate
 *     values like a {@link java.util.List}, yet has order-independent equality
 *     like a {@link java.util.Set}.  One typical use for a multiset is to
 *     represent a histogram.
 *
 * <dt>{@link cn.jfat.commons.collect.Multimap}
 * <dd>A new type, which is similar to {@link java.util.Map}, but may contain
 *     multiple entries with the same key. Some behaviors of
 *     {@link cn.jfat.commons.collect.Multimap} are left unspecified and are
 *     provided only by the subtypes mentioned below.
 *
 * <dt>{@link cn.jfat.commons.collect.ListMultimap}
 * <dd>An extension of {@link cn.jfat.commons.collect.Multimap} which permits
 *     duplicate entries, supports random access of values for a particular key,
 *     and has <i>partially order-dependent equality</i> as defined by
 *     {@link cn.jfat.commons.collect.ListMultimap#equals(Object)}. {@code
 *     ListMultimap} takes its name from the fact that the {@linkplain
 *     cn.jfat.commons.collect.ListMultimap#get collection of values}
 *     associated with a given key fulfills the {@link java.util.List} contract.
 *
 * <dt>{@link cn.jfat.commons.collect.SetMultimap}
 * <dd>An extension of {@link cn.jfat.commons.collect.Multimap} which has
 *     order-independent equality and does not allow duplicate entries; that is,
 *     while a key may appear twice in a {@code SetMultimap}, each must map to a
 *     different value.  {@code SetMultimap} takes its name from the fact that
 *     the {@linkplain cn.jfat.commons.collect.SetMultimap#get collection of
 *     values} associated with a given key fulfills the {@link java.util.Set}
 *     contract.
 *
 * <dt>{@link cn.jfat.commons.collect.SortedSetMultimap}
 * <dd>An extension of {@link cn.jfat.commons.collect.SetMultimap} for which
 *     the {@linkplain cn.jfat.commons.collect.SortedSetMultimap#get
 *     collection values} associated with a given key is a
 *     {@link java.util.SortedSet}.
 *
 * <dt>{@link cn.jfat.commons.collect.Table}
 * <dd>A new type, which is similar to {@link java.util.Map}, but which indexes
 *     its values by an ordered pair of keys, a row key and column key.
 *
 * <dt>{@link cn.jfat.commons.collect.ClassToInstanceMap}
 * <dd>An extension of {@link java.util.Map} that associates a raw type with an
 *     instance of that type.
 * </dl>
 *
 * <h2>Collection Implementations</h2>
 *
 * <h3>of {@link java.util.List}</h3>
 * <ul>
 * <li>{@link cn.jfat.commons.collect.ImmutableList}
 * </ul>
 *
 * <h3>of {@link java.util.Set}</h3>
 * <ul>
 * <li>{@link cn.jfat.commons.collect.ImmutableSet}
 * <li>{@link cn.jfat.commons.collect.ImmutableSortedSet}
 * <li>{@link cn.jfat.commons.collect.ContiguousSet} (see {@code Range})
 * </ul>
 *
 * <h3>of {@link java.util.Map}</h3>
 * <ul>
 * <li>{@link cn.jfat.commons.collect.ImmutableMap}
 * <li>{@link cn.jfat.commons.collect.ImmutableSortedMap}
 * <li>{@link cn.jfat.commons.collect.MapMaker}
 * </ul>
 *
 * <h3>of {@link cn.jfat.commons.collect.BiMap}</h3>
 * <ul>
 * <li>{@link cn.jfat.commons.collect.ImmutableBiMap}
 * <li>{@link cn.jfat.commons.collect.HashBiMap}
 * <li>{@link cn.jfat.commons.collect.EnumBiMap}
 * <li>{@link cn.jfat.commons.collect.EnumHashBiMap}
 * </ul>
 *
 * <h3>of {@link cn.jfat.commons.collect.Multiset}</h3>
 * <ul>
 * <li>{@link cn.jfat.commons.collect.ImmutableMultiset}
 * <li>{@link cn.jfat.commons.collect.HashMultiset}
 * <li>{@link cn.jfat.commons.collect.LinkedHashMultiset}
 * <li>{@link cn.jfat.commons.collect.TreeMultiset}
 * <li>{@link cn.jfat.commons.collect.EnumMultiset}
 * <li>{@link cn.jfat.commons.collect.ConcurrentHashMultiset}
 * </ul>
 *
 * <h3>of {@link cn.jfat.commons.collect.Multimap}</h3>
 * <ul>
 * <li>{@link cn.jfat.commons.collect.ImmutableMultimap}
 * <li>{@link cn.jfat.commons.collect.ImmutableListMultimap}
 * <li>{@link cn.jfat.commons.collect.ImmutableSetMultimap}
 * <li>{@link cn.jfat.commons.collect.ArrayListMultimap}
 * <li>{@link cn.jfat.commons.collect.HashMultimap}
 * <li>{@link cn.jfat.commons.collect.TreeMultimap}
 * <li>{@link cn.jfat.commons.collect.LinkedHashMultimap}
 * <li>{@link cn.jfat.commons.collect.LinkedListMultimap}
 * </ul>
 *
 * <h3>of {@link cn.jfat.commons.collect.Table}</h3>
 * <ul>
 * <li>{@link cn.jfat.commons.collect.ImmutableTable}
 * <li>{@link cn.jfat.commons.collect.ArrayTable}
 * <li>{@link cn.jfat.commons.collect.HashBasedTable}
 * <li>{@link cn.jfat.commons.collect.TreeBasedTable}
 * </ul>
 *
 * <h3>of {@link cn.jfat.commons.collect.ClassToInstanceMap}</h3>
 * <ul>
 * <li>{@link cn.jfat.commons.collect.ImmutableClassToInstanceMap}
 * <li>{@link cn.jfat.commons.collect.MutableClassToInstanceMap}
 * </ul>
 *
 * <h2>Classes of static utility methods</h2>
 *
 * <ul>
 * <li>{@link cn.jfat.commons.collect.Collections2}
 * <li>{@link cn.jfat.commons.collect.Iterators}
 * <li>{@link cn.jfat.commons.collect.Iterables}
 * <li>{@link cn.jfat.commons.collect.Lists}
 * <li>{@link cn.jfat.commons.collect.Maps}
 * <li>{@link cn.jfat.commons.collect.Queues}
 * <li>{@link cn.jfat.commons.collect.Sets}
 * <li>{@link cn.jfat.commons.collect.Multisets}
 * <li>{@link cn.jfat.commons.collect.Multimaps}
 * <li>{@link cn.jfat.commons.collect.Tables}
 * <li>{@link cn.jfat.commons.collect.ObjectArrays}
 * </ul>
 *
 * <h2>Comparison</h2>
 *
 * <ul>
 * <li>{@link cn.jfat.commons.collect.Ordering}
 * <li>{@link cn.jfat.commons.collect.ComparisonChain}
 * </ul>
 *
 * <h2>Abstract implementations</h2>
 *
 * <ul>
 * <li>{@link cn.jfat.commons.collect.AbstractIterator}
 * <li>{@link cn.jfat.commons.collect.AbstractSequentialIterator}
 * <li>{@link cn.jfat.commons.collect.ImmutableCollection}
 * <li>{@link cn.jfat.commons.collect.UnmodifiableIterator}
 * <li>{@link cn.jfat.commons.collect.UnmodifiableListIterator}
 * </ul>
 *
 * <h2>Ranges</h2>
 *
 * <ul>
 * <li>{@link cn.jfat.commons.collect.Range}
 * <li>{@link cn.jfat.commons.collect.RangeMap}
 * <li>{@link cn.jfat.commons.collect.DiscreteDomain}
 * <li>{@link cn.jfat.commons.collect.ContiguousSet}
 * </ul>
 *
 * <h2>Other</h2>
 *
 * <ul>
 * <li>{@link cn.jfat.commons.collect.Interner},
 *     {@link cn.jfat.commons.collect.Interners}
 * <li>{@link cn.jfat.commons.collect.Constraint},
 *     {@link cn.jfat.commons.collect.Constraints}
 * <li>{@link cn.jfat.commons.collect.MapConstraint},
 *     {@link cn.jfat.commons.collect.MapConstraints}
 * <li>{@link cn.jfat.commons.collect.MapDifference},
 *     {@link cn.jfat.commons.collect.SortedMapDifference}
 * <li>{@link cn.jfat.commons.collect.MinMaxPriorityQueue}
 * <li>{@link cn.jfat.commons.collect.PeekingIterator}
 * </ul>
 *
 * <h2>Forwarding collections</h2>
 *
 * <ul>
 * <li>{@link cn.jfat.commons.collect.ForwardingCollection}
 * <li>{@link cn.jfat.commons.collect.ForwardingConcurrentMap}
 * <li>{@link cn.jfat.commons.collect.ForwardingIterator}
 * <li>{@link cn.jfat.commons.collect.ForwardingList}
 * <li>{@link cn.jfat.commons.collect.ForwardingListIterator}
 * <li>{@link cn.jfat.commons.collect.ForwardingListMultimap}
 * <li>{@link cn.jfat.commons.collect.ForwardingMap}
 * <li>{@link cn.jfat.commons.collect.ForwardingMapEntry}
 * <li>{@link cn.jfat.commons.collect.ForwardingMultimap}
 * <li>{@link cn.jfat.commons.collect.ForwardingMultiset}
 * <li>{@link cn.jfat.commons.collect.ForwardingNavigableMap}
 * <li>{@link cn.jfat.commons.collect.ForwardingNavigableSet}
 * <li>{@link cn.jfat.commons.collect.ForwardingObject}
 * <li>{@link cn.jfat.commons.collect.ForwardingQueue}
 * <li>{@link cn.jfat.commons.collect.ForwardingSet}
 * <li>{@link cn.jfat.commons.collect.ForwardingSetMultimap}
 * <li>{@link cn.jfat.commons.collect.ForwardingSortedMap}
 * <li>{@link cn.jfat.commons.collect.ForwardingSortedMultiset}
 * <li>{@link cn.jfat.commons.collect.ForwardingSortedSet}
 * <li>{@link cn.jfat.commons.collect.ForwardingSortedSetMultimap}
 * <li>{@link cn.jfat.commons.collect.ForwardingTable}
 * </ul>
 */
@javax.annotation.ParametersAreNonnullByDefault
package cn.jfat.commons.collect;
