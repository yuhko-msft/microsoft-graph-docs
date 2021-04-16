---
title: "groupPolicyMigrationReport resource type"
description: "The Group Policy migration report."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupPolicyMigrationReport resource type

Namespace: microsoft.graph



The Group Policy migration report.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupPolicyMigrationReports](../api/grouppolicymigrationreport-list.md)|[groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) collection|Get a list of the [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) objects and their properties.|
|[Create groupPolicyMigrationReport](../api/grouppolicymigrationreport-create.md)|[groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md)|Create a new [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) object.|
|[Get groupPolicyMigrationReport](../api/grouppolicymigrationreport-get.md)|[groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md)|Read the properties and relationships of a [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) object.|
|[Update groupPolicyMigrationReport](../api/grouppolicymigrationreport-update.md)|[groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md)|Update the properties of a [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) object.|
|[Delete groupPolicyMigrationReport](../api/grouppolicymigrationreport-delete.md)|None|Deletes a [groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) object.|
|[createMigrationReport](../api/grouppolicymigrationreport-createmigrationreport.md)|String|**TODO: Add Description**|
|[List groupPolicySettingMappings](../api/grouppolicymigrationreport-list-grouppolicysettingmappings.md)|[groupPolicySettingMapping](../resources/grouppolicysettingmapping.md) collection|Get the groupPolicySettingMapping resources from the groupPolicySettingMappings navigation property.|
|[Create groupPolicySettingMapping](../api/grouppolicymigrationreport-post-grouppolicysettingmappings.md)|[groupPolicySettingMapping](../resources/grouppolicysettingmapping.md)|Create a new groupPolicySettingMapping object.|
|[List unsupportedGroupPolicyExtensions](../api/grouppolicymigrationreport-list-unsupportedgrouppolicyextensions.md)|[unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) collection|Get the unsupportedGroupPolicyExtension resources from the unsupportedGroupPolicyExtensions navigation property.|
|[Create unsupportedGroupPolicyExtension](../api/grouppolicymigrationreport-post-unsupportedgrouppolicyextensions.md)|[unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md)|Create a new unsupportedGroupPolicyExtension object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time at which the GroupPolicyMigrationReport was created.|
|displayName|String|The name of Group Policy Object from the GPO Xml Content|
|groupPolicyCreatedDateTime|DateTimeOffset|The date and time at which the GroupPolicyMigrationReport was created.|
|groupPolicyLastModifiedDateTime|DateTimeOffset|The date and time at which the GroupPolicyMigrationReport was last modified.|
|groupPolicyObjectId|Guid|The Group Policy Object GUID from GPO Xml content|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time at which the GroupPolicyMigrationReport was last modified.|
|migrationReadiness|groupPolicyMigrationReadiness|The Intune coverage for the associated Group Policy Object file. Possible values are: `none`, `partial`, `complete`, `error`, `notApplicable`.|
|ouDistinguishedName|String|The distinguished name of the OU.|
|supportedSettingsCount|Int32|The number of Group Policy Settings supported by Intune.|
|supportedSettingsPercent|Int32|The Percentage of Group Policy Settings supported by Intune.|
|targetedInActiveDirectory|Boolean|The Targeted in AD property from GPO Xml Content|
|totalSettingsCount|Int32|The total number of Group Policy Settings from GPO file.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|groupPolicySettingMappings|[groupPolicySettingMapping](../resources/grouppolicysettingmapping.md) collection|A list of group policy settings to MDM/Intune mappings.|
|unsupportedGroupPolicyExtensions|[unsupportedGroupPolicyExtension](../resources/unsupportedgrouppolicyextension.md) collection|A list of unsupported group policy extensions inside the Group Policy Object.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupPolicyMigrationReport",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupPolicyMigrationReport",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "groupPolicyCreatedDateTime": "String (timestamp)",
  "groupPolicyLastModifiedDateTime": "String (timestamp)",
  "groupPolicyObjectId": "Guid",
  "lastModifiedDateTime": "String (timestamp)",
  "migrationReadiness": "String",
  "ouDistinguishedName": "String",
  "supportedSettingsCount": "Integer",
  "supportedSettingsPercent": "Integer",
  "targetedInActiveDirectory": "Boolean",
  "totalSettingsCount": "Integer"
}
```

