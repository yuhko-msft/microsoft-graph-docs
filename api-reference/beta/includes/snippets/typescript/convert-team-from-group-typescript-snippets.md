---
description: "Automatically generated file. DO NOT MODIFY"
---

```typescript

//THIS SNIPPET IS A PREVIEW FOR THE KIOTA BASED SDK. NON-PRODUCTION USE ONLY
const graphServiceClient = new GraphServiceClient(requestAdapter);

const requestBody = new Team()
requestBody.channels = [
			new Channel();
requestBody.channels.additionalData = new Map([
					["displayName", "Class Announcements 📢"];
					["isFavoriteByDefault", true];
				]);
			new Channel();
requestBody.channels.additionalData = new Map([
					["displayName", "Homework 🏋️"];
					["isFavoriteByDefault", true];
				]);
		]
	],
requestBody.memberSettings = new TeamMemberSettings();
requestBody.memberSettings.allowCreateUpdateChannels = false;
requestBody.memberSettings.allowDeleteChannels = false;
requestBody.memberSettings.allowAddRemoveApps = false;
requestBody.memberSettings.allowCreateUpdateRemoveTabs = false;
requestBody.memberSettings.allowCreateUpdateRemoveConnectors = false;
requestBody.installedApps = [
			new TeamsAppInstallation();
requestBody.installedApps.additionalData = new Map([
					["teamsApp@odata.bind", "https://graph.microsoft.com/v1.0/appCatalogs/teamsApps('com.microsoft.teamspace.tab.vsts')"];
				]);
			new TeamsAppInstallation();
requestBody.installedApps.additionalData = new Map([
					["teamsApp@odata.bind", "https://graph.microsoft.com/v1.0/appCatalogs/teamsApps('1542629c-01b3-4a6d-8f76-1938b779e48d')"];
				]);
		]
	],
requestBody.additionalData = new Map([
		["template@odata.bind", "https://graph.microsoft.com/beta/teamsTemplates('standard')"];
		["group@odata.bind", "https://graph.microsoft.com/beta/groups('dbd8de4f-5d47-48da-87f1-594bed003375')"];
	]);
const result = async () => {
	await graphServiceClient.teams.post(requestBody);
}


```