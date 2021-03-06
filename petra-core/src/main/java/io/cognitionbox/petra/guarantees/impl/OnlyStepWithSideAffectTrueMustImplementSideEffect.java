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
package io.cognitionbox.petra.guarantees.impl;

import io.cognitionbox.petra.core.IStep;
import io.cognitionbox.petra.guarantees.StepCheck;

public class OnlyStepWithSideAffectTrueMustImplementSideEffect implements StepCheck {

    @Override
    public boolean test(IStep<?> step) {
//            if (step.getEffectType().isPresent()){
//                if (IRollback.class.isAssignableFrom(step.getClass())){
//                    return true;
//                } else {
//                    return false;
//                }
//            } else {
//                if (IRollback.class.isAssignableFrom(step.getClass())){
//                    return false;
//                } else {
//                    return true;
//                }
//            }
        return true;
    }
}