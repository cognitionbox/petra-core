package io.cognitionbox.petra.examples.simple2.d_parallel_sequences1;

import io.cognitionbox.petra.lang.PEdge;

public class SeqEdge extends PEdge<Y> {
    {
        type(Y.class);
        pre(y -> y.isA() ^ y.isB());
        func(y -> {
            y.state(State.values()[y.state().ordinal() + 1]);
        });
        post(y -> y.isB() ^ y.isC());
    }
}