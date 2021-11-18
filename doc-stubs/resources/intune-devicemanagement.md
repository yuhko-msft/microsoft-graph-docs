---
title: "deviceManagement resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagement resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get deviceManagement](../api/intune-devicemanagement-get.md)|[deviceManagement](../resources/intune-devicemanagement.md)|Read the properties and relationships of a [deviceManagement](../resources/intune-devicemanagement.md) object.|
|[Update deviceManagement](../api/intune-devicemanagement-update.md)|[deviceManagement](../resources/intune-devicemanagement.md)|Update the properties of a [deviceManagement](../resources/intune-devicemanagement.md) object.|
|[List intuneBrandingProfiles](../api/intune-devicemanagement-list-intunebrandingprofiles.md)|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) collection|Get the intuneBrandingProfile resources from the intuneBrandingProfiles navigation property.|
|[Create intuneBrandingProfile](../api/intune-devicemanagement-post-intunebrandingprofiles.md)|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md)|Create a new intuneBrandingProfile object.|
|[List windowsInformationProtectionAppLearningSummaries](../api/intune-devicemanagement-list-windowsinformationprotectionapplearningsummaries.md)|[windowsInformationProtectionAppLearningSummary](../resources/intune-windowsinformationprotectionapplearningsummary.md) collection|Get the windowsInformationProtectionAppLearningSummary resources from the windowsInformationProtectionAppLearningSummaries navigation property.|
|[Create windowsInformationProtectionAppLearningSummary](../api/intune-devicemanagement-post-windowsinformationprotectionapplearningsummaries.md)|[windowsInformationProtectionAppLearningSummary](../resources/intune-windowsinformationprotectionapplearningsummary.md)|Create a new windowsInformationProtectionAppLearningSummary object.|
|[List windowsInformationProtectionNetworkLearningSummaries](../api/intune-devicemanagement-list-windowsinformationprotectionnetworklearningsummaries.md)|[windowsInformationProtectionNetworkLearningSummary](../resources/intune-windowsinformationprotectionnetworklearningsummary.md) collection|Get the windowsInformationProtectionNetworkLearningSummary resources from the windowsInformationProtectionNetworkLearningSummaries navigation property.|
|[Create windowsInformationProtectionNetworkLearningSummary](../api/intune-devicemanagement-post-windowsinformationprotectionnetworklearningsummaries.md)|[windowsInformationProtectionNetworkLearningSummary](../resources/intune-windowsinformationprotectionnetworklearningsummary.md)|Create a new windowsInformationProtectionNetworkLearningSummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|intuneBrandingProfiles|[intuneBrandingProfile](../resources/intune-intunebrandingprofile.md) collection|Intune branding profiles targeted to AAD groups|
|windowsInformationProtectionAppLearningSummaries|[windowsInformationProtectionAppLearningSummary](../resources/intune-windowsinformationprotectionapplearningsummary.md) collection|The windows information protection app learning summaries.|
|windowsInformationProtectionNetworkLearningSummaries|[windowsInformationProtectionNetworkLearningSummary](../resources/intune-windowsinformationprotectionnetworklearningsummary.md) collection|The windows information protection network learning summaries.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagement",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagement",
  "id": "String (identifier)"
}
```

