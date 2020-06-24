package com.example.core_ui.presentation.ui.load_model_holder

import android.os.Parcelable
import dagger.Reusable
import javax.inject.Inject

/**
 * @author a.khodanovich
 */
@Reusable
class LoadModelHolder @Inject constructor() {

    @PublishedApi internal var loadModel: Parcelable? = null

}
