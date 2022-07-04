package com.example.demo.Core;

import com.example.demo.Persistence.DatabaseSavingMethods;
import com.example.demo.Persistence.LocalSaving;

public abstract class Managers {
protected DatabaseSavingMethods DBS1;
public LocalSaving Local = new LocalSaving();

	public abstract void SetDBSmethod(DatabaseSavingMethods DBS1);
}
