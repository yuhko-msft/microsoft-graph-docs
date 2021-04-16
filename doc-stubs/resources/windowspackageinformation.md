---
title: "windowsPackageInformation resource type"
description: "Contains properties for the package information for a Windows line of business app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsPackageInformation resource type

Namespace: microsoft.graph



Contains properties for the package information for a Windows line of business app.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicableArchitecture|windowsArchitecture|The Windows architecture for which this app can run on. Possible values are: `none`, `x86`, `x64`, `arm`, `neutral`, `arm64`.|
|displayName|String|The Display Name.|
|identityName|String|The Identity Name.|
|identityPublisher|String|The Identity Publisher.|
|identityResourceIdentifier|String|The Identity Resource Identifier.|
|identityVersion|String|The Identity Version.|
|minimumSupportedOperatingSystem|[windowsMinimumOperatingSystem](../resources/windowsminimumoperatingsystem.md)|The value for the minimum applicable operating system.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsPackageInformation"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsPackageInformation",
  "applicableArchitecture": "String",
  "displayName": "String",
  "identityName": "String",
  "identityPublisher": "String",
  "identityResourceIdentifier": "String",
  "identityVersion": "String",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.windowsMinimumOperatingSystem"
  }
}
```

