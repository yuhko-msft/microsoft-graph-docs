---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Team()
requestBody.displayName = "My Class Team";
requestBody.description = "My Class Team’s Description";
const channel = new Channel();
channel.additionalData = new Map<string, unknown>([
					["displayName", "Class Announcements 📢"],
					["isFavoriteByDefault", true]
				]);
const channel1 = new Channel();
channel1.additionalData = new Map<string, unknown>([
					["displayName", "Homework 🏋️"],
					["isFavoriteByDefault", true]
				]);
requestBody.channels = [
			channel,
			channel1
		]
requestBody.memberSettings = new TeamMemberSettings();
requestBody.memberSettings.allowCreateUpdateChannels = false;
requestBody.memberSettings.allowDeleteChannels = false;
requestBody.memberSettings.allowAddRemoveApps = false;
requestBody.memberSettings.allowCreateUpdateRemoveTabs = false;
requestBody.memberSettings.allowCreateUpdateRemoveConnectors = false;
const teamsappinstallation = new TeamsAppInstallation();
teamsappinstallation.additionalData = new Map<string, unknown>([
					["teamsApp@odata.bind", "https://graph.microsoft.com/v1.0/appCatalogs/teamsApps('com.microsoft.teamspace.tab.vsts')"]
				]);
const teamsappinstallation1 = new TeamsAppInstallation();
teamsappinstallation1.additionalData = new Map<string, unknown>([
					["teamsApp@odata.bind", "https://graph.microsoft.com/v1.0/appCatalogs/teamsApps('1542629c-01b3-4a6d-8f76-1938b779e48d')"]
				]);
requestBody.installedApps = [
			teamsappinstallation,
			teamsappinstallation1
		]
requestBody.additionalData = new Map<string, unknown>([
		["template@odata.bind", "https://graph.microsoft.com/beta/teamsTemplates('educationClass')"]
	]);
const result = async () => {
	await graphServiceClient.teams.post(requestBody);
}


```