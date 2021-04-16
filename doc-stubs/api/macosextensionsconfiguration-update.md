---
title: "Update macOSExtensionsConfiguration"
description: "Update the properties of a macOSExtensionsConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOSExtensionsConfiguration
Namespace: microsoft.graph



Update the properties of a [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH ** Entity URI for microsoft.graph.macOSExtensionsConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) object.

The following table shows the properties that are required when you update the [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|kernelExtensionAllowedTeamIdentifiers|String collection|All kernel extensions validly signed by the team identifiers in this list will be allowed to load.|
|kernelExtensionOverridesAllowed|Boolean|If set to true, users can approve additional kernel extensions not explicitly allowed by configurations profiles.|
|kernelExtensionsAllowed|[macOSKernelExtension](../resources/macoskernelextension.md) collection|A list of kernel extensions that will be allowed to load. . This collection can contain a maximum of 500 elements.|
|systemExtensionsAllowed|[macOSSystemExtension](../resources/macossystemextension.md) collection|Gets or sets a list of allowed macOS system extensions. This collection can contain a maximum of 500 elements.|
|systemExtensionsAllowedTeamIdentifiers|String collection|Gets or sets a list of allowed team identifiers. Any system extension signed with any of the specified team identifiers will be approved.|
|systemExtensionsAllowedTypes|[macOSSystemExtensionTypeMapping](../resources/macossystemextensiontypemapping.md) collection|Gets or sets a list of allowed macOS system extension types. This collection can contain a maximum of 500 elements.|
|systemExtensionsBlockOverride|Boolean|Gets or sets whether to allow the user to approve additional system extensions not explicitly allowed by configuration profiles.|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macosextensionsconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSExtensionsConfiguration not found
Content-Type: application/json
Content-length: 1230

{
  "@odata.type": "#microsoft.graph.macOSExtensionsConfiguration",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "kernelExtensionAllowedTeamIdentifiers": [
    "String"
  ],
  "kernelExtensionOverridesAllowed": "Boolean",
  "kernelExtensionsAllowed": [
    {
      "@odata.type": "microsoft.graph.macOSKernelExtension"
    }
  ],
  "systemExtensionsAllowed": [
    {
      "@odata.type": "microsoft.graph.macOSSystemExtension"
    }
  ],
  "systemExtensionsAllowedTeamIdentifiers": [
    "String"
  ],
  "systemExtensionsAllowedTypes": [
    {
      "@odata.type": "microsoft.graph.macOSSystemExtensionTypeMapping"
    }
  ],
  "systemExtensionsBlockOverride": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.macOSExtensionsConfiguration",
  "id": "a9d6979a-979a-a9d6-9a97-d6a99a97d6a9",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "kernelExtensionAllowedTeamIdentifiers": [
    "String"
  ],
  "kernelExtensionOverridesAllowed": "Boolean",
  "kernelExtensionsAllowed": [
    {
      "@odata.type": "microsoft.graph.macOSKernelExtension"
    }
  ],
  "systemExtensionsAllowed": [
    {
      "@odata.type": "microsoft.graph.macOSSystemExtension"
    }
  ],
  "systemExtensionsAllowedTeamIdentifiers": [
    "String"
  ],
  "systemExtensionsAllowedTypes": [
    {
      "@odata.type": "microsoft.graph.macOSSystemExtensionTypeMapping"
    }
  ],
  "systemExtensionsBlockOverride": "Boolean"
}
```

