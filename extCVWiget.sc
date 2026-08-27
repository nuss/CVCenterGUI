+CVWidget {
	midiDialog { this.subclassResponsibility(thisMethod) }
	oscDialog { this.subclassResponsibility(thisMethod) }
}

+CVWidgetKnob {
	midiDialog { |connector(0), parent|
		^MidiConnectorsEditorView(parent, widget: this, connector: connector).front
	}

	oscDialog { |connector(0), parent|
		^OscConnectorsEditorView(parent, widget: this, connector: connector).front
	}
}

+CVWidgetMS {
	midiDialog { |slot(0), connector(0), parent|
		^MidiConnectorsEditorView(parent, widget: this, slot: slot, connector: connector).front;
	}

	oscDialog { |slot(0), connector(0), parent|
		^OscConnectorsEditorView(parent, widget: this, slot: slot, connector: connector).front;
	}
}