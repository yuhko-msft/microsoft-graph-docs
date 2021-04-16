---
title: "iosAzureAdSingleSignOnExtension resource type"
description: "Represents an Azure AD-type Single Sign-On extension profile for iOS devices."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosAzureAdSingleSignOnExtension resource type

Namespace: microsoft.graph



Represents an Azure AD-type Single Sign-On extension profile for iOS devices.


Inherits from [iosSingleSignOnExtension](../resources/iossinglesignonextension.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bundleIdAccessControlList|String collection|An optional list of additional bundle IDs allowed to use the AAD extension for single sign-on.|
|configurations|[keyTypedValuePair](../resources/keytypedvaluepair.md) collection|Gets or sets a list of typed key-value pairs used to configure Credential-type profiles. This collection can contain a maximum of 500 elements.|
|enableSharedDeviceMode|Boolean|Enables or disables shared device mode.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosAzureAdSingleSignOnExtension"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosAzureAdSingleSignOnExtension",
  "bundleIdAccessControlList": [
    "String"
  ],
  "configurations": [
    {
      "@odata.type": "microsoft.graph.keyBooleanValuePair"
    }
  ],
  "enableSharedDeviceMode": "Boolean"
}
```

