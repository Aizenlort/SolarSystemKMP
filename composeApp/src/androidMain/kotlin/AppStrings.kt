import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import org.ncgroup.solarsystemkmp.R

@Composable
actual fun getStringErrorUnknown(): String {
    return stringResource(R.string.error_unknown)
}

@Composable
actual fun getStringButtonRetry(): String {
    return stringResource(R.string.button_retry)
}

@Composable
actual fun getStringButtonView(): String {
    return stringResource(R.string.button_view)
}