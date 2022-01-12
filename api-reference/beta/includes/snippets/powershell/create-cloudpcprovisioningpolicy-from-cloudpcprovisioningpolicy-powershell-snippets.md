---
description: "Automatically generated file. DO NOT MODIFY"
---

```powershell

Import-Module Microsoft.Graph.DeviceManagement.Administration

$params = @{
	"@odata.type" = "#microsoft.graph.cloudPcProvisioningPolicy"
	DisplayName = "Display Name value"
	Description = "Description value"
	OnPremisesConnectionId = "6bf90392-5fea-459a-9e9d-a2484abbffff"
	ImageId = "Image ID value"
	ImageDisplayName = "Image Display Name value"
	ImageType = "gallery"
}

New-MgDeviceManagementVirtualEndpointProvisioningPolicy -BodyParameter $params

```