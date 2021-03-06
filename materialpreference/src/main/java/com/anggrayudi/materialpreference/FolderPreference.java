package com.anggrayudi.materialpreference;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;

/**
 * UNDER CONSTRUCTION. DO NOT USE!
 *  <table>
 *  <tr>
 *  <th>Attribute</th>
 *  <th>Value Type</th>
 *  </tr><tr>
 *  <td><code>app:defaultFolder</code></td>
 *  <td>{@link FolderType} => external, download, dcim, alarm, movies, music, notifications, pictures, podcasts, ringtones, documents</td>
 *  </tr>
 *  </table>
 */
@SuppressLint("RestrictedApi")
public class FolderPreference extends Preference implements Preference.OnPreferenceClickListener {

    public FolderPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs, defStyleAttr, defStyleRes);
    }

    public FolderPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    public FolderPreference(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FolderPreference(Context context) {
        this(context, null);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        setOnPreferenceClickListener(this);
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        return true;
    }
}
