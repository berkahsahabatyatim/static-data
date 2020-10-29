// please create basic interface for activity when connecting and received response from backend server

interface BaseView {
  fun onSuccessGetData()
  fun showGeneralError()
  fun showInetError()
  fun onLoadingButton()
  fun onFailGetData()
  fun onFailValidate()
}
