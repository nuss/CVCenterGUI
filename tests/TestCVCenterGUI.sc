TestCVCenterGUI : UnitTest {
	*runAll {
		[
			TestConnectorElementView,
			TestConnectorNameField,
			TestConnectorSelect,
			TestMidiLearnButton,
			TestMidiSrcSelect,
			TestMidiChanField,
			TestMidiCtrlField,
			TestMidiModeSelect,
			TestMidiZeroNumberBox,
			TestSnapDistanceNumberBox,
			TestMidiResolutionNumberBox,
			TestSlidersPerGroupNumberBox,
			TestMidiInitButton,
			TestPlayPauseButton,
			TestOscZeroCrossingText,
			TestConnectorRemoveButton,
			TestMappingSelect,
			TestMidiConnectorsEditorView,
			TestOscConnectorsEditorView,
			TestOscSelectsComboView
		].do(_.run)
	}
}