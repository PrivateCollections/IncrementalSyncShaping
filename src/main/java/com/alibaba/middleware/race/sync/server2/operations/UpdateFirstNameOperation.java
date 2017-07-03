package com.alibaba.middleware.race.sync.server2.operations;

import static com.alibaba.middleware.race.sync.server2.RestoreComputation.recordMap;

/**
 * Created by yche on 6/24/17.
 */
public class UpdateFirstNameOperation extends LogOperation {
    byte firstNameIndex = -1;

    public UpdateFirstNameOperation(long relevantKey, byte firstNameIndex) {
        super(relevantKey);
        this.firstNameIndex = firstNameIndex;
    }

    @Override
    public void act() {
        InsertOperation insertOperation = (InsertOperation) recordMap.get(this); //2
        insertOperation.firstNameIndex = this.firstNameIndex;
    }
}
