/**
 * Copyright 2016-2020 Aran Hakki
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.cognitionbox.petra.core;

import io.cognitionbox.petra.lang.Guard;
import io.cognitionbox.petra.util.function.ITriConsumer;

import java.io.Serializable;
import java.util.List;

public interface IEJoin3<A, B, C> extends Serializable {
    Guard<? super A> a();

    Guard<? super B> b();

    Guard<? super C> c();

    ITriConsumer<List<A>, List<B>, List<C>> func();
}
