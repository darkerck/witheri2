// Generated by view binder compiler. Do not edit!
package com.example.witheri.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.witheri.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentDaysBinding implements ViewBinding {
  @NonNull
  private final RecyclerView rootView;

  @NonNull
  public final RecyclerView rcView;

  private FragmentDaysBinding(@NonNull RecyclerView rootView, @NonNull RecyclerView rcView) {
    this.rootView = rootView;
    this.rcView = rcView;
  }

  @Override
  @NonNull
  public RecyclerView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDaysBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDaysBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_days, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDaysBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    RecyclerView rcView = (RecyclerView) rootView;

    return new FragmentDaysBinding((RecyclerView) rootView, rcView);
  }
}
