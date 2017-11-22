DSL org.tetrabox.example.Devs {
	abstract-syntax {
		ecore = "platform:/resource/org.tetrabox.example.devs.model/model/model.ecore"
	}
	semantic {
		k3 = "org.tetrabox.example.devs.k3dsa.AtomicModelAspect",
		"org.tetrabox.example.devs.k3dsa.CoupledModelAspect",
		"org.tetrabox.example.devs.k3dsa.DEVSModelAspect"
	}
}
